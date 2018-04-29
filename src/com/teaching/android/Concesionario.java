package com.teaching.android;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Concesionario {

    private String nombre;
    private String direccion;
    private int numeroTelefono;
    private Collection<Vehiculo> baseDatos=new LinkedList<Vehiculo>();



    public Concesionario() {

    }

    public Concesionario(String nombre, String direccion, int numeroTelefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void introducirVehiculo(Vehiculo v){
        baseDatos.add(v);
    }

    @Override
    public String toString() {
        int i=1;
        String cad;
        cad = "Concesionario\n\n" +
                "nombre='" + nombre + "\n" +
                "direccion='" + direccion + "\n" +
                "numero Telefono=" + numeroTelefono + "\n\n" +
                "base datos vehiculos" + "\n\n";
        for (Vehiculo v:baseDatos) {
                cad = cad + "Vehiculo " + i + "\n\n" + v.toString();
                i++;
        }
        return cad;
    }

    public void reserva(String matricula) throws Exception{

        int i;
        boolean reservada=false;
        for (Vehiculo v:baseDatos) {
            if (matricula == v.getMatricula()) {
                v.setReserva(true);
                reservada=true;
                break;
            }
        }
        if(!reservada){
            throw new Exception();
        }
    }

    public void caracteristicas(String matricula) {

        for (Vehiculo v:baseDatos) {
            if (matricula.equalsIgnoreCase(v.getMatricula()) ) {
                Coche c1 = (Coche) v;
                System.out.println("Numero plazas del coche buscado por matricula = "+c1.getNumeroPlazas());
                String extras;
                if(c1.isExtras()) {
                    extras = "SI";
                }
                else{
                    extras = "NO";
                }
                System.out.println("Extras= "+extras);
            }
        }
    }

    public void mostrar(String matricula,String color){

        for(Vehiculo v:baseDatos){
            if(v.getMatricula().contains(matricula)||v.getColor().contains(color)){
                System.out.println(v);
            }
        }
    }
}



