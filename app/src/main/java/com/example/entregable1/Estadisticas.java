package com.example.entregable1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Estadisticas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);
    }

    //Metodo para pasar a la estadistica amarillo
    public void Eamarillo1(View view) {
        Intent eamarillo = new Intent(this, Eamarillo.class);
        startActivity(eamarillo);
    }

    //Metodo para pasar a la estadistica Verde
    public void Everde1(View view) {
        Intent everde = new Intent(this, Everde.class);
        startActivity(everde);
    }

    //Metodo para pasar a la estadistica Azul
    public void Eazul1(View view) {
        Intent eazul = new Intent(this, Eazul.class);
        startActivity(eazul);
    }

    //Metodo para pasar a la estadistica Gris
    public void Egris1 (View view){
        Intent egris = new Intent(this, Egris.class);
        startActivity(egris);
    }

    //Metodo para pasar a la estadistica Naranja
    public void Enaranja1 (View view){
        Intent enaranja = new Intent(this, Enaranja.class);
        startActivity(enaranja);
    }

    //Metodo para pasar a la estadistica Rojo
    public void Erojo1 (View view){
        Intent erojo = new Intent(this, Erojo.class);
        startActivity(erojo);
    }

    //Metodo para pasar al menu
    public void principal1 (View view){
        Intent principal = new Intent(this, Principal.class);
        startActivity(principal);
    }
}