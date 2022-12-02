package com.poveda.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TercerActivity extends AppCompatActivity {
    Metodos m = new Metodos();
    Button siguiente,cerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        cerrar = findViewById(R.id.tercerCerrar);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.Cerrar(TercerActivity.this);
            }
        });
    }
}