package com.teaching.android;

public class Persona {
    private String nombre;
    private float dinero;


    public Persona (String nombre, float dinero){
    this.nombre=nombre;
    this.dinero=dinero;
    }
    public void pay(Persona x,float pago){
        this.dinero=this.dinero+pago;
        x.dinero=x.dinero-pago;
        System.out.println(x.nombre + " paga a "+ this.nombre +" "+ pago );
    }
    public float getDinero(){
        return dinero;
    }
}
