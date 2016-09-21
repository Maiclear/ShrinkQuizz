package com.desafiolatam.shrinkquizz.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.desafiolatam.shrinkquizz.R;
import com.desafiolatam.shrinkquizz.views.CoolFragment;
import com.desafiolatam.shrinkquizz.views.LuckyFragment;
import com.desafiolatam.shrinkquizz.views.MatchFragment;

/**
 * Created by Mai_Clear on 9/21/16.
 */


//page adapter agarra fragmentos y los pone viewpager
// un fragmento es un ventana que participa del ciclo de vida de una actividad, para encapsular nuestro codigo y se mas
// facil de leer, sea algo mas limpio, que se genere en el fragmento y no el la actividad , como las parcial views

public class PagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return CoolFragment.newInstance();
            case 1:
                return LuckyFragment.newInstance();
            case 2:
                return MatchFragment.newInstance();
            default:
                return CoolFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.cool);
            case 1:
                return  context.getString(R.string.lucky);
            case 2:
                return context.getString(R.string.match);
            default:
                return "";
        }
    }
}
