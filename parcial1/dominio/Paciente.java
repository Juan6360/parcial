package com.alejandro.parcial.dominio;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    //Atributos
    private long cedula;
    private String nombre;
    private List<Enfermedad> enfermedades;

    public Paciente(long cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNombre(){return this.nombre;}

    public long getCedula() {return this.cedula;}
}