package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

      Persona a=new Persona ("Pepe",900);
      Persona b=new Persona ("Paco",500);

        a.pay(b,200);
        System.out.println("Pepe tiene "+ a.getDinero()+" y Paco tiene "+ b.getDinero() );


    }
}

