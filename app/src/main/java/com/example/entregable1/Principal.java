package com.example.entregable1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;




public class Principal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_registro, menu);
        return true;
    }


    //Metodo para pasar al inicio
    public void Inicio1 (View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para pasar a categorias
    public void Categorias1(View view){
        Intent categorias = new Intent(this, Categorias.class);
        startActivity(categorias);
    }

    //Metodo para pasar a consejos
    public void Estadisticas1(View view){
        Intent estadisticas = new Intent(this, Estadisticas.class);
        startActivity(estadisticas);
    }

    //Metodo para pasar a consejos
    public void Consejo1(View view){
        Intent consejo = new Intent(this, Consejos.class);
        startActivity(consejo);
    }




}