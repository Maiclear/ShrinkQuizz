package com.desafiolatam.shrinkquizz.data;

/**
 * Created by Mai_Clear on 9/23/16.
 */

public class CoolAnswer {

    private String name;
    private boolean party;
    private int drinks;

    public CoolAnswer(String name, boolean party, int drinks) {
        this.name = name;
        this.party = party;
        this.drinks = drinks;
    }

    public String getName() {
        return name;
    }

    public boolean isParty() {
        return party;
    }

    public int getDrinks() {
        return drinks;
    }
}
