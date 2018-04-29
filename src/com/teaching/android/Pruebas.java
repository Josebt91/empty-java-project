package com.teaching.android;

public class Pruebas {
    public static void main(String[] args) {

        Vehiculo vehiculo=new Vehiculo();
        Concesionario con1 =new Concesionario("MANZANA","C/SWE",390505);
        Coche c1 =new Coche ("3345BFR","VERDE",false,9567,5,false);
        Coche c2 =new Coche ("3000BFR","VERDE",true,9567,4,false);
        Coche c3 =new Coche ("3770ASR","ROJO",false,9444,6,true);

        Moto m1=new Moto("7374FJDJ","AZUL",false,9494,2000);
        Moto m2=new Moto("7557SSD","VIOLETA",true,2000,1000);


            con1.introducirVehiculo(c1);
            con1.introducirVehiculo(c2);
            con1.introducirVehiculo(c3);
            con1.introducirVehiculo(m1);
            con1.introducirVehiculo(m2);
            con1.introducirVehiculo(c1);
            System.out.println("Base de datos completa. \n");

        try {
            con1.reserva("3345BFR");
            con1.reserva("7374FDJ");
        }catch(Exception ex){
            System.out.println("Coche no registrado en base de datos \n");
        }
        System.out.println(con1);
        System.out.println(c1);
        System.out.println(c2);
        con1.caracteristicas("3345bfr");
        con1.mostrar("33","A");


    }
}