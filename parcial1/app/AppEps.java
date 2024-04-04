package com.alejandro.parcial.app;

import com.alejandro.parcial.dominio.Enfermedad;
import com.alejandro.parcial.dominio.Eps;

public class AppEps {
    public static void main(String[] args) {
        Eps nuevaEPs = new Eps();

        nuevaEPs.afiliarPaciente(123, "Juan");
        nuevaEPs.afiliarPaciente(323, "Carlos");

        nuevaEPs.buscarPaciente(123);
        nuevaEPs.sacarPaciente(124);


    }
}
