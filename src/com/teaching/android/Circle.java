package com.teaching.android;

public class Circle {

    private int radio;
    private Punto centro;


    public Circle (){}
    public Circle (int x, int y,int radio){
        this.centro = new Punto(x,y);
        this.radio = radio;
    }
    public Circle (Punto centro,int radio){
        this.centro =centro;
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    public double getArea(){
        double area = Math.PI*Math.pow(radio,2);
        System.out.println("El valor de la area es ");
        return area;
    }
    public double getCircumference(){
        double circunferencia = Math.PI*2*radio;
        System.out.println("El valor de la circunferencia es ");
        return circunferencia;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", centro=" + centro +
                '}';
    }
}
