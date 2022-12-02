package com.poveda.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
    Button siguiente,cerrar;
    TextView nombre,apellido,div1,div2,numero;
    Metodos m = new Metodos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        Bundle extras = getIntent().getExtras();
        siguiente = findViewById(R.id.segundoSiguiente);
        cerrar = findViewById(R.id.segundoCerrar);
        nombre = findViewById(R.id.segundoNombre);
        apellido = findViewById(R.id.segundApellido);
        div1 = findViewById(R.id.segundoDividiendo);
        div2 = findViewById(R.id.segundoDivisor);
        numero = findViewById(R.id.segundoInverso);
        if(extras != null){
            nombre.setText(extras.getString("nombre"));
            apellido.setText(extras.getString("apellido"));
            div1.setText(extras.getString("div1"));
            div2.setText(extras.getString("div2"));
            numero.setText(extras.getString("inverso"));
        }
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
                Intent i = new Intent(SegundoActivity.this,MainActivity.class);
                i.putExtra("nombre",String.valueOf(nombre.getText()));
                i.putExtra("apellido",String.valueOf(nombre.getText()));
                i.putExtra("div1",String.valueOf(div1.getText()));
                i.putExtra("div2",String.valueOf(div2.getText()));
                i.putExtra("inverso",String.valueOf(numero.getText()));
                startActivity(i);
            }
        });
    }
}