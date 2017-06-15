package com.guness.CardRegistry.model;

/**
 * Created by guness on 15/06/2017.
 */
public class BankModel {
    private String name;
    private String id;

    public BankModel(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
