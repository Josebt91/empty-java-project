package com.teaching.android;

public class Vehiculo{
    private String matricula;
    private String color;
    private boolean reserva;
    private int precio;
    public Vehiculo (){

    }
    public Vehiculo (String matricula,String color,boolean reserva,int precio){
        this.matricula=matricula;
        this.color=color;
        this.reserva=reserva;
        this.precio=precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String cad;
        cad=    "matricula=" + matricula + "\n" +
                "color=" + color + "\n" +
                "precio=" + precio + "\n" +
                "reserva=";
        if(reserva){
             cad=cad+"SI"+"\n";
        }
        else{
            cad=cad+"NO"+"\n";
        }
        return cad;
    }
}
