package com.desafiolatam.shrinkquizz.views;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.desafiolatam.shrinkquizz.R;
import com.desafiolatam.shrinkquizz.data.CoolResult;


public class CoolFragment extends Fragment {

    private TextInputEditText nameEt;
    private Switch coolSwitch;
    private TextView drinkTv;
    private SeekBar seekBar;


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

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nameEt = (TextInputEditText) view.findViewById(R.id.userName);
        coolSwitch = (Switch) view.findViewById(R.id.partySw);
        drinkTv = (TextView) view.findViewById(R.id.dreamsTv);
        seekBar = (SeekBar) view.findViewById(R.id.drinksSb);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                drinkTv.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

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

        String name = nameEt.getText().toString();
        boolean party = coolSwitch.isChecked();
        int drinks = seekBar.getProgress();
        CoolResult coolResult = new CoolResult(name, party, drinks);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
        alertDialog.setMessage(coolResult.details());
        alertDialog.show();


    }


}
