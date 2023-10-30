package com.example.entregable1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    //Metodo para pasar a Registro amarillo
    public void Ramarillo1(View view) {
        Intent ramarillo = new Intent(this, Ramarillo.class);
        startActivity(ramarillo);
    }

    //Metodo para pasar a Registro Verde
    public void Rverde1(View view) {
        Intent rverde = new Intent(this, Rverde.class);
        startActivity(rverde);
    }

    //Metodo para pasar a Registro Azul
    public void Razul1(View view) {
        Intent razul = new Intent(this, Razul.class);
        startActivity(razul);
    }

    //Metodo para pasar a Registro Gris
    public void Rgris1 (View view){
        Intent rgris = new Intent(this, Rgris.class);
        startActivity(rgris);
    }

    //Metodo para pasar a Registro Naranja
    public void Rnaranja1 (View view){
        Intent rnaranja = new Intent(this, Rnaranja.class);
        startActivity(rnaranja);
    }

    //Metodo para pasar a Registro Rojo
    public void Rrojo1 (View view){
        Intent rrojo = new Intent(this, Rrojo.class);
        startActivity(rrojo);
    }

    //Metodo para pasar al menu
    public void principal1 (View view){
        Intent principal = new Intent(this, Principal.class);
        startActivity(principal);
    }
}