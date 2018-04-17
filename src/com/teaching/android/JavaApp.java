package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        System.out.print("Escribe un número majo ");
        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();
        int resto = valor%2;

        if(valor!=0&resto==0) {
            System.out.println(" Valor par");
        }
        else if (valor==0){
            System.out.println(" A MI NO ME ENGAÑAS GAÑAN");
        }
        else
        {
            System.out.println(" Valor impar");
        }
    }

}
