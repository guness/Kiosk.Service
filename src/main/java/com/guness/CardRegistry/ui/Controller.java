package com.guness.CardRegistry.ui;

import com.guness.CardRegistry.core.CardReaderWriterManager;
import com.guness.CardRegistry.core.DataManager;
import com.guness.CardRegistry.core.WebServiceManager;
import com.guness.CardRegistry.model.BankModel;
import com.guness.CardRegistry.model.CardModel;
import com.guness.CardRegistry.ws.CardServiceResponse;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.WindowEvent;
import org.nfctools.api.TagScannerListener;

import java.rmi.RemoteException;

public class Controller implements TagScannerListener {

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

    public Controller() {
    }

    @FXML
    private void initialize() {
        bankChoiceBox.setItems(DataManager.getInstance().getBankModelList());
    }

    public void onScanningEnded() {
    }

    public void onScanningFailed(Throwable throwable) {

    }

    public void onTagHandingFailed(Throwable throwable) {

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
        statusLabel.setText("Loading...");
        loadButton.setDisable(true);


        Task task = new Task<Void>() {
            @Override
            public Void call() throws RemoteException, IllegalAccessException {
                String accountNumber = accountNumberInput.getText();
                BankModel bankModel = bankChoiceBox.getValue();
                CardServiceResponse response = WebServiceManager.getInstance().retrieveCardData(accountNumber, bankModel.getId());
                CardReaderWriterManager.getInstance().setCardModel(CardModel.fromCardData(response.getCard()), new CardReaderWriterManager.CardWriteListener() {
                    @Override
                    public void onSuccess() {
                        statusLabel.setText("Success");
                        loadButton.setDisable(false);
                    }

                    @Override
                    public void onFail() {
                        statusLabel.setText("Card Failed");
                        loadButton.setDisable(false);
                    }
                });
                return null;
            }
        };
        ProgressBar bar = new ProgressBar();
        bar.progressProperty().bind(task.progressProperty());
        task.setOnSucceeded(event -> statusLabel.setText("Ready for Card Write"));
        task.setOnFailed(event -> {
            statusLabel.setText("Service Failed");
            loadButton.setDisable(false);
        });
        new Thread(task).start();
    }
}
