package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        Random generator = new Random();
        int random = generator.nextInt(10)+1;
        System.out.print("Programa para adivinar número hasta el 10 en 3 intentos  \n");

        Scanner keyboard = new Scanner (System.in);
        System.out.print("Introduzca un valor ");
        int valor = keyboard.nextInt();
        for(int i=0;i<2;i++) {
            if (valor == random) {
                i=3;
            } else if (valor < random) {
                System.out.print("Mayor \n");
                System.out.print("Introduzca nuevo valor ");
                valor = keyboard.nextInt();
            } else {
                System.out.print("Menor \n");
                System.out.print("Introduzca nuevo valor ");
                valor = keyboard.nextInt();
            }
        }
        if (random == valor) {
            System.out.print("Correcto ");
        }
        else {
            System.out.print("Fallaste el numero correcto es " + random);
            }
        }
}

