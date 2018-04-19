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
        Circle c1=new Circle(3,5,6);
        Circle c2=new Circle(p1,5);
        System.out.println(c1.getArea());
        System.out.println(c2.getCircumference()+" "+c2);
        Circle c3=new Circle();
        c3.setRadio(3);
        c3.setCentro(p2);
        System.out.println(c3+" "+c3.getArea()+" "+c3.getCircumference());


    }
}

