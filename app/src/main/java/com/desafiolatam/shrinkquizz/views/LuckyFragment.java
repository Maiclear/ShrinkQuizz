package com.desafiolatam.shrinkquizz.views;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.desafiolatam.shrinkquizz.R;
import com.desafiolatam.shrinkquizz.data.LuckyResult;


public class LuckyFragment extends Fragment {

    private CheckBox luckyCb, moodCb;

    public static LuckyFragment newInstance() {
        return new LuckyFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lucky, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        luckyCb = (CheckBox) view.findViewById(R.id.luckyCb);
        moodCb = (CheckBox) view.findViewById(R.id.moodCb);

        luckyCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                moodCb.setChecked(b);
            }
        });

        Button resultBtn = (Button) view.findViewById(R.id.resultBtn);
        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showResult();

            }
        });


    }

    private void showResult() {

        LuckyResult luckyResult = new LuckyResult(luckyCb.isChecked());

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
        alertDialog.setMessage(luckyResult.details());
        alertDialog.show();


    }
}
