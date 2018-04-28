package com.teaching.android;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String matricula, String color, boolean reserva, int precio, int cilindrada) {
        super(matricula, color, reserva, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString()+
                "cilindrada=" + cilindrada+"\n\n";
    }
}
