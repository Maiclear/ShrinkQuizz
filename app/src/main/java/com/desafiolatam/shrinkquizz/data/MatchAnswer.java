package com.desafiolatam.shrinkquizz.data;

import android.content.Context;

/**
 * Created by Mai_Clear on 9/26/16.
 */

public class MatchAnswer {

    private String userName, loverName, quarter;
    private Context context;

    public MatchAnswer(String userName, String loverName, String quarter, Context context) {
        this.userName = userName;
        this.loverName = loverName;
        this.quarter = quarter;
        this.context = context;
    }

    public String getUserName() {
        return userName;
    }

    public String getLoverName() {
        return loverName;
    }

    public String getQuarter() {
        return quarter;
    }

    public Context getContext() {
        return context;
    }
}
