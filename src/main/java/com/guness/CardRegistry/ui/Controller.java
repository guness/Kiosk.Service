package com.guness.CardRegistry.ui;

import com.guness.CardRegistry.core.CardReaderWriterManager;
import com.guness.CardRegistry.core.DataManager;
import com.guness.CardRegistry.model.BankModel;
import com.guness.CardRegistry.model.CardModel;
import com.guness.CardRegistry.util.JavaFxScheduler;
import com.guness.kiosk.webservice.manager.WebServiceManager;
import com.guness.kiosk.webservice.network.RetrieveResponse;
import io.reactivex.schedulers.Schedulers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.WindowEvent;

public class Controller {

    @FXML
    public BorderPane root;

    @FXML
    public ChoiceBox<BankModel> bankChoiceBox;

    @FXML
    public Button loadButton;

    @FXML
    public TextField accountNumberInput;

    @FXML
    public Label statusLabel;

    @FXML
    public GridPane userInfoPane;

    @FXML
    public Label nameLabel;

    @FXML
    public Label lastNameLabel;

    @FXML
    public Label cardNumberLabel;

    public Controller() {
    }

    @FXML
    private void initialize() {
        bankChoiceBox.setItems(DataManager.getInstance().getBankModelList());
    }

    @FXML
    public void onSettingsClicked() {
    }

    @FXML
    public void onExitClicked() {
        root.fireEvent(new WindowEvent(root.getScene().getWindow(), WindowEvent.WINDOW_CLOSE_REQUEST));
    }

    @FXML
    public void onAboutClicked() {
    }

    @FXML
    public void onLoadCardClicked() {
        userInfoPane.setVisible(false);
        statusLabel.setText("Loading...");
        loadButton.setDisable(true);

        final String accountNumber = accountNumberInput.getText();
        final BankModel bankModel = bankChoiceBox.getValue();


        WebServiceManager.getInstance().retrieveCard(bankModel.getId(), accountNumber)
                .observeOn(JavaFxScheduler.platform())
                .subscribeOn(Schedulers.io())
                .subscribe(retrieveResponse -> {
                    statusLabel.setText("Ready for Card Write");
                    CardModel cardModel = CardModel.fromCard(retrieveResponse.Card);
                    String RFID = cardModel.getRFID();
                    CardReaderWriterManager.getInstance().setCardModel(cardModel, new CardReaderWriterManager.CardWriteListener() {
                        @Override
                        public void onSuccess() {
                            if (RFID != null && RFID.equals(cardModel.getRFID())) {
                                onCardRegistryCompleted(retrieveResponse);
                            } else {
                                WebServiceManager.getInstance().updateCard(cardModel.getNumber(), cardModel.getRFID())
                                        .observeOn(JavaFxScheduler.platform())
                                        .subscribeOn(Schedulers.io())
                                        .subscribe(updateResponse -> onCardRegistryCompleted(retrieveResponse), throwable -> {
                                            throwable.printStackTrace();
                                            statusLabel.setText("Service Failed");
                                            loadButton.setDisable(false);
                                        });
                            }
                        }

                        @Override
                        public void onFail() {
                            statusLabel.setText("Card Failed");
                            loadButton.setDisable(false);
                        }
                    });
                }, throwable -> {
                    throwable.printStackTrace();
                    statusLabel.setText("Service Failed");
                    loadButton.setDisable(false);
                });
    }

    private void onCardRegistryCompleted(RetrieveResponse retrieveResponse) {
        statusLabel.setText("Success");
        loadButton.setDisable(false);
        nameLabel.setText(retrieveResponse.Customer.Firstname);
        lastNameLabel.setText(retrieveResponse.Customer.Lastname);
        String number = retrieveResponse.Card.Number;
        number = number.substring(0, 4) + " " + number.substring(4, 8) + " " + number.substring(8, 12) + " " + number.substring(12, number.length());
        cardNumberLabel.setText(number);
        userInfoPane.setVisible(true);
    }
}
