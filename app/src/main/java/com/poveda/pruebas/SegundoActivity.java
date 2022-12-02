package com.poveda.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundoActivity extends AppCompatActivity {
    Button siguiente,cerrar;
    Metodos m = new Metodos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        siguiente = findViewById(R.id.segundoSiguiente);
        cerrar = findViewById(R.id.segundoCerrar);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SegundoActivity.this,TercerActivity.class);
                startActivity(i);
            }
        });
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.Cerrar(SegundoActivity.this);
            }
        });
    }
}