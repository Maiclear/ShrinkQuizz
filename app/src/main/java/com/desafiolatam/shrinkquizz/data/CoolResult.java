package com.desafiolatam.shrinkquizz.data;

/**
 * Created by Mai_Clear on 9/23/16.
 */

public class CoolResult extends CoolAnswer {


    public CoolResult(String name, boolean party, int drinks) {
        super(name, party, drinks);
    }

    public String details() {

        String result = "Gracias por participar: " + getName() + party() + drinks();
        return result;

    }

    private String party() {
        if (isParty()) {
            return " A todos les encanta salir contigo.";
        }else {
            return " Trabaja en tus abilidades sociales.";
        }
    }


    private String drinks() {
        if (getDrinks() < 5) {
            return " Bebes como un bebé";
        }else {
            return " Eres una bestia de las fiestas";
        }
    }


}
