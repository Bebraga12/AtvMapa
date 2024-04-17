package com.bernardo.atvmapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistroActvity extends AppCompatActivity {

    private EditText editTextInicio;
    private EditText editTextFim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editTextInicio = findViewById(R.id.edit_text1);
        editTextFim = findViewById(R.id.edit_text2);
    }

    public void onClickConfirm(View view){
        String inicio = editTextInicio.getText().toString();
        String fim = editTextFim.getText().toString();

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(getString(R.string.inicio_key), inicio);
        editor.putString(getString(R.string.fim_key), fim);
        editor.apply();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
