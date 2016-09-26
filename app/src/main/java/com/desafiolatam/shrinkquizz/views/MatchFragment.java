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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.desafiolatam.shrinkquizz.R;
import com.desafiolatam.shrinkquizz.data.MatchResult;


public class MatchFragment extends Fragment {

    private TextInputEditText userName, loverName;
    private RadioGroup radioGroup;

    public static MatchFragment newInstance() {
        return new MatchFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        userName = (TextInputEditText) view.findViewById(R.id.userName);
        loverName = (TextInputEditText) view.findViewById(R.id.loverName);
        radioGroup = (RadioGroup) view.findViewById(R.id.quarterRg);

        Button button = (Button) view.findViewById(R.id.resultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showResult();

            }
        });

    }


    private void showResult() {
        int selectedId = radioGroup.getCheckedRadioButtonId();

        if (selectedId != -1) {

            RadioButton radioButton = (RadioButton) radioGroup.findViewById(selectedId);
            MatchResult matchResult = new MatchResult(
                    userName.getText().toString(),
                    loverName.getText().toString(),
                    radioButton.getText().toString(),
                    getContext());

            AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
            alertDialog.setMessage(matchResult.details());
            alertDialog.show();


        }else{
            Toast.makeText(getContext(), "Selecionafhecha", Toast.LENGTH_SHORT).show();
        }


    }

}
