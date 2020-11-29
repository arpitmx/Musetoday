package com.dhaaaga.musetoday;

public class CardModel {
    private String card_username;
    private String card_link;

    public CardModel(String cardUsername, String cardLink) {
        this.card_username = cardUsername;
        this.card_link = cardLink;

    }


    public void setCardUsername(String cardUsername) {
        this.card_username = cardUsername;
    }

    public String getCard_username() {
        return card_username;
    }

    public void setCard_link(String card_link) {
        this.card_link = card_link;
    }


    public String getCard_link() {
        return card_link;
    }
}
