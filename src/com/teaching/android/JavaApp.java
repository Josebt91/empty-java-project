package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        Random generator = new Random();
        System.out.print("Programa para adivinar número hasta el 10 en 3 intentos  \n");


        boolean repeat = true;
        while (repeat) {
            int random = generator.nextInt(10) + 1;
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Introduzca un valor ");
            int valor = keyboard.nextInt();
            for (int i = 0; i < 2; i++) {
                if (valor == random) {
                    i = 3;
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
                System.out.println("Correcto ");
            } else {
                System.out.println("Fallaste el numero correcto es " + random);
            }
            System.out.println("¿Quieres volver a probar? SI/NO");
            Scanner keyboard1 = new Scanner(System.in);
            String yes = keyboard1.next();
            if (yes.equalsIgnoreCase("si")) {
                random = generator.nextInt(10) + 1;
            }else{
                repeat = false;
            }
        }
    }
}

