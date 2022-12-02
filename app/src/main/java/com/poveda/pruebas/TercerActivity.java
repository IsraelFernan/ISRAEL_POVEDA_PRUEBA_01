package com.poveda.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TercerActivity extends AppCompatActivity {
    Metodos m = new Metodos();
    TextView nombre,apellido,dividiendo,divisor;
    Button siguiente,cerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        Bundle extras = getIntent().getExtras();
        cerrar = findViewById(R.id.tercerCerrar);
        nombre = findViewById(R.id.tercerNombre);
        apellido = findViewById(R.id.tercerApellido);
        dividiendo = findViewById(R.id.tercerDividiendo);
        divisor = findViewById(R.id.tercerDivisor);
        nombre.setText(extras.getString("nombre"));
        apellido.setText(extras.getString("apellido"));
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TercerActivity.this,SegundoActivity.class);
                i.putExtra("nombre",String.valueOf(nombre.getText()));
                i.putExtra("apellido",String.valueOf(nombre.getText()));
                i.putExtra("div1",String.valueOf(nombre.getText()));
                i.putExtra("div2",String.valueOf(nombre.getText()));
                startActivity(i);
            }
        });
    }
}