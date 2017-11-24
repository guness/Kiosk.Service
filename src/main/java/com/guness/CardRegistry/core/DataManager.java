package com.guness.CardRegistry.core;

import com.guness.CardRegistry.model.BankModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by guness on 15/06/2017.
 */
public class DataManager {
    private static DataManager ourInstance = new DataManager();

    public static DataManager getInstance() {
        return ourInstance;
    }

    private ObservableList<BankModel> bankModelList = FXCollections.observableArrayList();

    private DataManager() {
    }

    public void init() {
        bankModelList.setAll(
                new BankModel("BMFN", "A53AAFB2-4D02-4B84-9807-17C124256518"),
                new BankModel("IRON FX", "7BE9E2EE-E0AD-4B07-95EE-A8F213FBC144"),
                new BankModel("FXGIANTS", "96E753A0-6082-4E5D-BFEF-D051F09AC613"));
    }

    public ObservableList<BankModel> getBankModelList() {
        return bankModelList;
    }
}
