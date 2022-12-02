package com.poveda.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
    Button siguiente,cerrar;
    TextView nombre,apellido;
    Metodos m = new Metodos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        siguiente = findViewById(R.id.segundoSiguiente);
        cerrar = findViewById(R.id.segundoCerrar);
        nombre = findViewById(R.id.segundoNombre);
        apellido = findViewById(R.id.segundApellido);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SegundoActivity.this,TercerActivity.class);
                i.putExtra("nombre",String.valueOf(nombre.getText()));
                i.putExtra("apellido",String.valueOf(apellido.getText()));
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