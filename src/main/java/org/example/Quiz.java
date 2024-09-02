package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public void evaluarPregunta(int indicePregunta, int respuestaUsuario) {
        if(preguntas.get(indicePregunta).getRespuestaCorrecta() == respuestaUsuario) {
            puntaje++;
        }
    }

    public void mostrarPuntaje() {
        System.out.println("Su puntaje es: " + puntaje);
    }

    public void realizarPregunta(Preguntas pregunta) {
        pregunta.mostrarPregunta();
        System.out.print("Indique su respuesta: ");
        int respuestaUsuario = Integer.parseInt(Scanner.nextLine());
        evaluarPregunta(pregunta, respuestaUsuario);
    }

    public void iniciarQuiz() {
        for (Preguntas pregunta: preguntas) {
            realizarPregunta(pregunta);
        }
        mostrarPuntaje();
    }
}
