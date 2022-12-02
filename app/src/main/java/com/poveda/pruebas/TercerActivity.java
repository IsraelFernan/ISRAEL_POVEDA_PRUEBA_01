package com.poveda.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TercerActivity extends AppCompatActivity {
    Metodos m = new Metodos();
    TextView nombre,apellido;
    Button siguiente,cerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        Bundle extras = getIntent().getExtras();
        cerrar = findViewById(R.id.tercerCerrar);
        nombre = findViewById(R.id.tercerNombre);
        apellido = findViewById(R.id.tercerApellido);
        nombre.setText(extras.getString("nombre"));
        apellido.setText(extras.getString("apellido"));
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.Cerrar(TercerActivity.this);
            }
        });
    }
}