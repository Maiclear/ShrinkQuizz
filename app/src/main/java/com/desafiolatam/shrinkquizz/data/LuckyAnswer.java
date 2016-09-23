package com.desafiolatam.shrinkquizz.data;

import java.util.Date;

/**
 * Created by Mai_Clear on 9/23/16.
 */

public class LuckyAnswer {

    private boolean happy, date;

    public LuckyAnswer(boolean happy) {
        this.happy = happy;
        date = new LuckyDate().today();
    }

    public boolean isHappy() {
        return happy;
    }

    public boolean isDate() {
        return date;
    }

    private class LuckyDate {

        private Date date = new Date();

        private boolean today() {

            int year = date.getYear();
            int month = date.getMonth();
            int day = date.getDay();

            int sum = year + month + day;

            if (sum % 2 == 0) {
                return true;
            }else {
                return false;
            }

        }

    }


}
