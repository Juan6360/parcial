package com.alejandro.parcial.dominio;

import javax.lang.model.element.PackageElement;
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

    public long getCedula() {return this.cedula;}
}