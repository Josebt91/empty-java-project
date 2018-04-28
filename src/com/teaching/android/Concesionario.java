package com.teaching.android;

public class Concesionario {
    public static int TAM = 5;
    private String nombre;
    private String direccion;
    private int numeroTelefono;
    private Vehiculo[] baseDatos=new Vehiculo[TAM];



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

    public void introducirVehiculo(Vehiculo v) {

        for (int i = 0; i < TAM; i++) {
            if (baseDatos[i] == null) {
                baseDatos[i] = v;
                break;
            }
        }
    }

    @Override
    public String toString() {
        String cad;
        cad = "Concesionario\n\n" +
                "nombre='" + nombre + "\n" +
                "direccion='" + direccion + "\n" +
                "numero Telefono=" + numeroTelefono + "\n\n" +
                "base datos vehiculos" + "\n\n";
        for (int i = 0; i < TAM; i++) {
            if (baseDatos[i] != null) {
                cad = cad + "Vehiculo " + (i + 1) + "\n\n" + baseDatos[i];
            }
        }
        return cad;
    }

    public void reserva(String matricula) {

        for (int i = 0; i < TAM; i++) {
            if (matricula == baseDatos[i].getMatricula()) {
                baseDatos[i].setReserva(true);
                break;
            }
        }
    }

    public void caracteristicas(String matricula) {

        for (int i = 0; i < TAM; i++) {
            if (matricula.equalsIgnoreCase(baseDatos[i].getMatricula()) ) {
                Coche c1 = (Coche) baseDatos[i];
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

}

