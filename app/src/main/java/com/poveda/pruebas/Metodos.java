package com.poveda.pruebas;

import android.app.Activity;

public class Metodos {
    public void Cerrar(Activity actividad){
        actividad.finish();
    }
    public int Dividir(int valor1, int valor2){
        int residuo = valor1 % valor2;
        return residuo;
    }
}
