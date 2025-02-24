package com.pmdm.faltarclase.bd;

public class DTODatos {

    private int id;

    private String modelo;

    private int kilometros;

    private String asignatura;

    public DTODatos(int id, String modelo, int kilometros, String asignatura){
        this.id = id;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.asignatura = asignatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String toString(){
        return "Id: " + id + "\nModelo: " + modelo + "\nKilómetros: " + kilometros + "\nAsignatura: " + asignatura;
    }
}
