package com.desafiolatam.shrinkquizz.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.desafiolatam.shrinkquizz.R;


public class CoolFragment extends Fragment {

    public CoolFragment() {
        // Required empty public constructor
    }

    public static CoolFragment newInstance() {
        return new CoolFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cool, container, false);
    }

}
