package com.example.entregable1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //Metodo para pasar a la pestaña principal
    public void Principal1 (View view){
        Intent principal = new Intent(this, Principal.class);
        startActivity(principal);
    }

    //Metodo para pasar al registro
    public void Registro1 (View view){
        Intent registro = new Intent(this, Registrarse.class);
        startActivity(registro);
    }
}