package com.alejandro.parcial.dominio;

import java.util.ArrayList;
import java.util.List;

public class Eps {
    //Atributos
    public static final byte CAPACIDAD = 100;
    private String nombre;
    private List<Paciente> pacientes;
    private List<Enfermedad> enfermedades;

    public Enfermedad(){this.enfermedades = new ArrayList<>();}
    public Eps(){this.pacientes = new ArrayList<>();}

    //Metodos
    public boolean afiliarPaciente(long cedula, String nombre){
        Paciente nuevoPaciente = new Paciente(cedula, nombre);

        if(this.pacientes.size() < CAPACIDAD){
            if(this.buscarPaciente(cedula) == null){
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
        Enfermedad pacienteEnfermo = new Enfermedad(enfermedad);
        pacienteEnfermo.getNombre()
    }

    public List<Paciente> obtenerPacientesSinEnfermedades(){
        return null;
    }

    public void ordenarPacientesPorNombre(){
        List<Paciente> listaOrdenda = this.pacientes.sort();
    }
}
