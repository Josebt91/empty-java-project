package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
    int n=3;
    int m=n*n;
    int k=0;
    int[][] matriz=new int[n][n];
    int [] matrizDatos = {3,2,1,1,2,3,2,3,1};

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
                matriz[i][j] = matrizDatos [k];
                System.out.print(matriz [i][j]);
                ++k;
            }
        System.out.println();
        }



    }
}

