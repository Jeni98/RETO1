package com.example.entregable1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Rgris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rgris);
    }

    //Metodo para pasar al menu
    public void principal1 (View view){
        Intent principal = new Intent(this, Principal.class);
        startActivity(principal);
    }

    //Metodo para pasar a consejos
    public void Consejo1 (View view){
        Intent consejo = new Intent(this, Consejos.class);
        startActivity(consejo);
    }
}