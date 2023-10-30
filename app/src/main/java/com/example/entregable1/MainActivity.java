package com.example.entregable1;

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

    //Metodo para pasar al inicio de sesion
    public void Login1 (View view){
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }

    //Metodo para pasar al registro
    public void Registro1 (View view){
        Intent registro = new Intent(this, Registrarse.class);
        startActivity(registro);
    }

}