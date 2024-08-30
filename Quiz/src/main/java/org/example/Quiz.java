package org.example;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Preguntas> preguntas;
    private int puntaje;

    public Quiz() {
        preguntas = new ArrayList<Preguntas>();
        puntaje = 0;
    }

    public void agregarpregunta(Preguntas pregunta) {
        preguntas.add(pregunta);
    }

    public void evaluarPreguntas(int indicePregunta, int respuestaUsuario) {
        if(preguntas.get(indicePregunta).getRespuestaCorrecta() == respuestaUsuario) {
            puntaje++;
        }
    }

    public void mostrarPreguntas() {
        System.out.println("Su puntaje es: " + puntaje);
    }
}
