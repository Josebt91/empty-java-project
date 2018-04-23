package com.teaching.android;

import sun.nio.cs.ext.MacArabic;

public class Matriz {                                           //Creación de la clase matriz
    private int[][] matriz;                                     //Atributos de la clase matriz
    private int size;

    public Matriz(int size) {                                   //Constructor de la clase matriz, que requiere como parametro size
        this.size = size;                                       //Asignación del tamaño de la matriz
        matriz = new int[size][size];                           //Creación del tamaño de la matriz, para que se guarde en la memoria.
    }

    public void asignarDatos(int[] vector) {                    //Metodo para asignar datos, que requiere como parametro de entrada un vector.
        if (size == Math.sqrt(vector.length)) {                 //Condición para comprobar que el tamaño del vector sea igual que el tamaño de la matriz.
            int indice = 0;                                     //Variable para incrementar posiciones en el vector
            for (int i = 0; i < size; i++) {                    //Bucle que recorre las filas de la matriz.
                for (int j = 0; j < size; j++) {                //Bucle que recorre las columnas de la matriz
                    matriz[i][j] = vector[indice++];            //Asignación de los valores del vector a la matriz.
                }
            }
        }
    }

    public void mostrar() {                                     //Metodo para mostrar por pantalla los valores de la matriz.
        for (int i = 0; i < size; i++) {                        //Bucle que recorre las filas de la matriz.
            for (int j = 0; j < size; j++) {                    //Bucle que recoore las columnas de la matriz.
                System.out.print(matriz[i][j] + " ");           //Muestra el valor contenido en cada posición.
            }
            System.out.println();                               //Salto de linea en cambio de fila.
        }
    }

    public Matriz suma(Matriz matriz) {                                                     //Metodo para sumar dos matrices con parametro de entrada una matriz.

        Matriz sumaMatriz = new Matriz(size);                                               //Creación de nueva variable tipo matriz para asignar los datos de la operación.
        if (size == matriz.size) {                                                          //Condición para comparar el tamaño de ambas matriz para proceder a operar.
            for (int i = 0; i < size; i++) {                                                //Bucle que recorre las filas de la matriz.
                for (int j = 0; j < size; j++) {                                            //Bucle que recorre las columnas de la matriz.
                    sumaMatriz.matriz[i][j] = this.matriz[i][j] + matriz.matriz[i][j];      //Asignación de la operación suma en la posicion correspondiente
                }
            }
        }
        return sumaMatriz;
    }

    public Matriz multiplica(Matriz matriz) {                                                         //Metodo para multiplicar dos matrices posición por posición con parametro de entrada una matriz.
        Matriz multiplicaMatriz = new Matriz(size);                                                 //Creación de nueva variable tipo matriz para asignar los datos de la operación.
        if (size == matriz.size) {                                                                  //Condición para comparar el tamaño de ambas matriz para proceder a operar.
            for (int i = 0; i < size; i++) {                                                        //Bucle que recorre las filas de la matriz.
                for (int j = 0; j < size; j++) {                                                    //Bucle que recorre las columnas de la matriz.
                    multiplicaMatriz.matriz[i][j] = this.matriz[i][j] * matriz.matriz[i][j];        //Asignación de la operación suma en la posicion correspondiente
                }
            }
        }
    return multiplicaMatriz;
    }
}

