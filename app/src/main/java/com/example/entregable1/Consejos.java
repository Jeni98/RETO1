package com.example.entregable1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Consejos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejos);
    }

    //Metodo para pasar a reducir
    public void Reducir1 (View view){
        Intent reducir = new Intent(this, Reducir.class);
        startActivity(reducir);
    }

    //Metodo para pasar a reusar
    public void Reusar1 (View view){
        Intent reusar = new Intent(this, Reusar.class);
        startActivity(reusar);
    }

    //Metodo para pasar a reciclar
    public void Reciclar1 (View view){
        Intent reciclar = new Intent(this, Reciclar.class);
        startActivity(reciclar);
    }
}