package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        Punto p1 = new Punto (2,4);
        Punto p2 = new Punto (3,5);
        System.out.println("Coordenadas del primer "+ p1);
        System.out.println("Coordenadas del segundo "+ p2);
        System.out.println(p2.distancia(p1));
        System.out.println(p2.distancia(4,7));


    }
}

