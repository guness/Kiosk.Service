package com.guness.CardRegistry.ui;

import com.guness.CardRegistry.core.CardReaderWriterManager;
import com.guness.CardRegistry.core.DataManager;
import com.guness.CardRegistry.core.WebServiceManager;
import com.guness.CardRegistry.model.BankModel;
import com.guness.CardRegistry.model.CardModel;
import com.guness.CardRegistry.ws.CardServiceResponse;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.WindowEvent;

import java.rmi.RemoteException;

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


        Task<CardServiceResponse> task = new Task<CardServiceResponse>() {
            @Override
            public CardServiceResponse call() throws RemoteException, IllegalAccessException {
                String accountNumber = accountNumberInput.getText();
                BankModel bankModel = bankChoiceBox.getValue();
                CardServiceResponse response = WebServiceManager.getInstance().retrieveCardData(accountNumber, bankModel.getId());
                CardReaderWriterManager.getInstance().setCardModel(CardModel.fromCardData(response.getCard()), new CardReaderWriterManager.CardWriteListener() {
                    @Override
                    public void onSuccess() {
                        statusLabel.setText("Success");
                        loadButton.setDisable(false);
                        nameLabel.setText(response.getCustomer().getFirstname());
                        lastNameLabel.setText(response.getCustomer().getLastname());
                        String number = response.getCard().getNumber();
                        number = number.substring(0, 4) + " " + number.substring(4, 8) + " " + number.substring(8, 12) + " " + number.substring(12, number.length());
                        cardNumberLabel.setText(number);
                        userInfoPane.setVisible(true);
                    }

                    @Override
                    public void onFail() {
                        statusLabel.setText("Card Failed");
                        loadButton.setDisable(false);
                    }
                });
                return response;
            }
        };
        task.setOnSucceeded(event -> statusLabel.setText("Ready for Card Write"));
        task.setOnFailed(event -> {
            statusLabel.setText("Service Failed");
            loadButton.setDisable(false);
        });
        new Thread(task).start();
    }
}
