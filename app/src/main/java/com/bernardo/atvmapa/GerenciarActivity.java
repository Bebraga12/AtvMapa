package com.bernardo.atvmapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class GerenciarActivity extends AppCompatActivity {

    private EditText editTextInicio;
    private EditText editTextFim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerenciar);

        editTextInicio = findViewById(R.id.edit_text_inicio);
        editTextFim = findViewById(R.id.edit_text_fim);

        // Recuperar as informações guardadas no SharedPreferences e exibi-las nos EditTexts
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        String inicio = sharedPref.getString(getString(R.string.inicio_key), "");
        String fim = sharedPref.getString(getString(R.string.fim_key), "");

        editTextInicio.setText(inicio);
        editTextFim.setText(fim);


    }
}