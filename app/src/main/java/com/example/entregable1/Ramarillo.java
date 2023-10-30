package com.example.entregable1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Ramarillo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramarillo);
    }
    //Metodo para pasar al menu
    public void principal1 (View view){
        Intent principal = new Intent(this, Principal.class);
        startActivity(principal);
    }

    //Metodo para pasar a categorias
    public void Categorias1 (View view){
        Intent categoria= new Intent(this, Categorias.class);
        startActivity(categoria);
    }
}