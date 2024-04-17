package com.bernardo.atvmapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMap(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void onClickRegistro(View view){
        Intent intent = new Intent(this, RegistroActvity.class);
        startActivity(intent);
    }

    public void onClickGerenciar(View view){
        Intent intent = new Intent(this, GerenciarActivity.class);
        startActivity(intent);
    }

    public void onClickConfig(View view) {
        Intent intent = new Intent(this, ConfigActvity.class);
        startActivity(intent);
    }
}

