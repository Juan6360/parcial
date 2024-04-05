package com.alejandro.parcial.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Eps {
    //Atributos
    public static final byte CAPACIDAD = 100;
    private String nombre;
    private List<Paciente> pacientes;

    public Eps(String nombre){
        this.pacientes = new ArrayList<>();
        this.nombre = nombre;
    }

    //Metodos
    public boolean afiliarPaciente(long cedula, String nombre){

        if(this.pacientes.size() < CAPACIDAD){
            if(this.buscarPaciente(cedula) == null){
                Paciente nuevoPaciente = new Paciente(cedula, nombre);
                this.pacientes.add(nuevoPaciente);
                return true;
            }else{
                System.out.println("El paciente ya esta afiliado." + '\n');
                return false;
            }
        }else{
            System.out.println("Eps en capacidad maxima." + '\n');
        }
        return false;
    }

    public  void sacarPaciente(long cedula){
        for (Paciente paciente : pacientes){
            if (paciente.getCedula() == cedula) {
                this.pacientes.remove(paciente);
                break;
            }
        }
        System.out.println("Paciente no afiliado." + '\n');
    }

    public Paciente buscarPaciente(long cedula){
        Paciente pacienteBuscado = null;
        for (Paciente paciente : pacientes) {
            if (paciente.getCedula() == cedula) {
                pacienteBuscado = paciente;
                return pacienteBuscado;
            }
        }
        return null;
    }

    public List<Paciente> buscarPacientesPorEnfermedad(String enfermedad){
        return null;
    }

    public List<Paciente> obtenerPacientesSinEnfermedades(){
        return null;
    }

    public void ordenarPacientesPorNombre(){
        this.pacientes.sort(Comparator.comparing(Paciente::getNombre));
    }
}
