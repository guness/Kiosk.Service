package com.guness.CardRegistry.model;

import com.guness.CardRegistry.ws.CardData;

/**
 * Created by guness on 15/06/2017.
 */
public class CardModel {
    private String ID;
    private String secret;
    private String number;

    public CardModel(String ID, String secret, String number) {
        this.ID = ID;
        this.secret = secret;
        this.number = number;
    }

    public static CardModel fromCardData(CardData data) {
        return new CardModel(data.getId(), data.getSecret(), data.getNumber());
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
