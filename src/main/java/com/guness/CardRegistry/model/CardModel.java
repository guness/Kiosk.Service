package com.guness.CardRegistry.model;

import com.guness.kiosk.webservice.model.Card;

/**
 * Created by guness on 15/06/2017.
 */
public class CardModel {
    private String ID;
    private String RFID;
    private String secret;
    private String number;

    public CardModel(String RFID, String ID, String secret, String number) {
        this.RFID = RFID;
        this.ID = ID;
        this.secret = secret;
        this.number = number;
    }

    public static CardModel fromCard(Card card) {
        return new CardModel(card.RFID, card.Id, card.Secret, card.Number);
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

    public String getRFID() {
        return RFID;
    }

    public void setRFID(String RFID) {
        this.RFID = RFID;
    }
}
