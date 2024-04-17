package com.bernardo.atvmapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class ConfigActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_actvity);
    }

    public void onClickSalvar(View view){
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioGroup radioGroup3 = findViewById(R.id.radioGroup3);
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);

        // -- 1
        SharedPreferences sharedPreferences1 = getSharedPreferences("radioGroup1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = sharedPreferences1.edit();

        int selectedRadioButtonId1 = radioGroup1.getCheckedRadioButtonId();
        editor1.putInt("select_radio1", selectedRadioButtonId1);
        editor1.apply();

        // -- 2
        SharedPreferences sharedPreferences2 = getSharedPreferences("radioGroup2", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = sharedPreferences2.edit();

        int selectedRadioButtonId2 = radioGroup2.getCheckedRadioButtonId();
        editor2.putInt("select_radio2", selectedRadioButtonId2);
        editor2.apply();

        // -- 3
        SharedPreferences sharedPreferences3 = getSharedPreferences("radioGroup3", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor3 = sharedPreferences3.edit();

        int selectedRadioButtonId3 = radioGroup3.getCheckedRadioButtonId();
        editor3.putInt("select_radio3", selectedRadioButtonId3);
        editor3.apply();

        // -- 4
        SharedPreferences sharedPreferences4 = getSharedPreferences("radioGroup4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor4 = sharedPreferences4.edit();

        int selectedRadioButtonId4 = radioGroup4.getCheckedRadioButtonId();
        editor4.putInt("select_radio4", selectedRadioButtonId4);
        editor4.apply();
    }
}