package com.example.entregable1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }

    //Metodo que al darle click en registrarse se devuelve a la pagina de Login para iniciar sesion
    public void Login1 (View view){
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }
}