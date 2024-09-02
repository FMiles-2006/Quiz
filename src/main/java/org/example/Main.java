package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        List<String> respuestas1 = new ArrayList<String>();
        respuestas1.add("Negro");
        respuestas1.add("Verde");
        respuestas1.add("Blanco");
        respuestas1.add("Azul");
        Preguntas pregunta1 = new Preguntas("De que color era el caballo de San Martin",
            respuestas1, 3);
        quiz.agregarpregunta(pregunta1);

//        pregunta1.mostrarPregunta();

        quiz.iniciarQuiz();
    }
}