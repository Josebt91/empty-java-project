package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

    int [] matrizDatos = {3,2,1,1,2,3,2,3,1};
    int [] matrizDatos2 = {1,2,3,2,3,1,3,3,3};
    int size=(int)Math.sqrt(matrizDatos.length);
    Matriz matriz = new Matriz(size);
    Matriz matriz2 = new Matriz(size);
    matriz.asignarDatos(matrizDatos);
    matriz2.asignarDatos(matrizDatos2);
    matriz.mostrar();
    matriz2.mostrar();
    matriz.suma(matriz2).mostrar();
    matriz.multiplica(matriz2).mostrar();
    }
}

