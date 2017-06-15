package com.guness.CardRegistry;

import com.guness.CardRegistry.core.CardReaderWriterManager;
import com.guness.CardRegistry.core.DataManager;
import com.guness.CardRegistry.core.WebServiceManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception {
        DataManager.getInstance().init();
        CardReaderWriterManager.getInstance().init();
        WebServiceManager.getInstance().init();

        Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
        window.setTitle("Trade Center");
        window.setScene(new Scene(root, 700, 400));
        window.setMinWidth(500);
        window.setMinHeight(300);
        window.setMaxWidth(1000);
        window.setMaxHeight(600);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
