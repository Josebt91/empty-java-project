package com.teaching.android;

import java.util.Scanner;

public class Coche extends Vehiculo{
    private int numeroPlazas;
    private boolean extras;
    public Coche (String matricula, String color,boolean reserva, int precio,int numeroPlazas,boolean extras){
        super(matricula,color,reserva,precio);
        this.numeroPlazas=numeroPlazas;
        this.extras=extras;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        String cad;
        cad=    "numero plazas=" + numeroPlazas +
                "\nextras=";
        if(extras){
            cad=cad+ "SI\n\n";
        }else{
            cad=cad+ "NO\n\n";
        }
        return super.toString()+cad;
    }

}
