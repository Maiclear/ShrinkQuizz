package com.desafiolatam.shrinkquizz.data;

import android.content.Context;

import com.desafiolatam.shrinkquizz.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mai_Clear on 9/26/16.
 */

public class MatchResult extends MatchAnswer {

    public MatchResult(String userName, String loverName, String quarter, Context context) {
        super(userName, loverName, quarter, context);
    }

    public String details() {
        int sum = new NameDetails().result() + new QuarterResult().result();
        if (sum >= 100) {
            if (sum % 2 == 0) {
                return "Son la pareja perfecta";

            }else {
                return " son casi";
            }
        }else{
            if (sum % 2 == 0) {
                return "podrían mejorar";
            }else{
                return "evalua tu relación";
            }
        }
    }


    private class NameDetails {

        private int userSize = getUserName().length();
        private int loverSize = getLoverName().length();


        private int result() {
            int diff = userSize - loverSize;
            if (diff <= 0) {
                return 100;
            }else {
                return 10;
            }
        }
    }

    private class QuarterResult {
        private Map<String , Integer> map = new HashMap<>();

        private void setMap() {
            String[] quarter = getContext().getResources().getStringArray(R.array.quarters_array);
            for (int i = 0; i < quarter.length; i++) {
                map.put(quarter[i], i);

            }
        }

        private int result() {
            setMap();
            int result= map.get(getQuarter());
            return result;
        }

    }
}
