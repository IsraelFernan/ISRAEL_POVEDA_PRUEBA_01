package com.poveda.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Metodos m = new Metodos();
    Button siguiente;
    TextView nombre,apellido,div1,div2,numero,mResiduo,parteEntera;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle extras = getIntent().getExtras();
        siguiente = findViewById(R.id.mainSiguiente);
        nombre = findViewById(R.id.mainNombre);
        apellido = findViewById(R.id.mainApellido);
        div1 = findViewById(R.id.mainDividiendo);
        div2 = findViewById(R.id.mainDivisor);
        numero = findViewById(R.id.mainInverso);
        mResiduo = findViewById(R.id.mainResiduo);
        parteEntera = findViewById(R.id.mainParteEntera);
        if(extras != null){
            nombre.setText(extras.getString("nombre"));
            apellido.setText(extras.getString("apellido"));
            div1.setText(extras.getString("div1"));
            div2.setText(extras.getString("div2"));
            numero.setText(extras.getString("inverso"));
            parteEntera.setText(extras.getString("div2"));
            int residuo = m.Dividir(Integer.parseInt(extras.getString("div1")),Integer.parseInt(extras.getString("div2")));
            mResiduo.setText(String.valueOf(residuo));
        }

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SegundoActivity.class);
                startActivity(i);
            }
        });
    }
}