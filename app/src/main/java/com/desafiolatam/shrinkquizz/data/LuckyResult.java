package com.desafiolatam.shrinkquizz.data;

/**
 * Created by Mai_Clear on 9/23/16.
 */

public class LuckyResult extends LuckyAnswer {

    public LuckyResult(boolean happy) {
        super(happy);
    }
    public String details() {
    return happy() +date();
    }

    private String happy() {
        if (isHappy()) {
            return " que bueno mother fucker";
        }else {
            return "celavi";
        }
    }

    private String date() {
        if (isDate()){
            return "hoy no es tu dia";
        }else {
            return "buens";
        }
    }
}
