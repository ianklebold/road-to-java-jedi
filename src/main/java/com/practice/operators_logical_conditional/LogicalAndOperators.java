package com.practice.operators_logical_conditional;

public class LogicalAndOperators{
    public static void main(String[] args) {
    

        // El simbolo & trabaja a nivel de bit, es decir con & verifica si un bit es 1 o 0. Con && verifica los dos lados sean 1 para retornar verdadero
        //El simbolo | trabaja a nivel de bit, es decir con | verifica si un bit es 1 o 0. Con || verifica los dos lados almenos uno sea 1 para retornar verdadero

        int topScore = 80;

        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");

        }
       
        if(topScore > 90 || topScore <= 90){
            System.out.println("Either or both of the condicion are true");

        }

        //Como la primera evaluacion es falsa la segunda ya ni se trata
        if(topScore == secondTopScore && comprobarEvaluacion()){
            System.out.println("Greater than second top score and less than 100");

        }

        //Como la primera evaluacion es true la segunda evaluacion ya no es necesaria porque predomina el OR
        if(comprobarEvaluacionParaOr() || comprobarEvaluacionParaOrFalse()){
            System.out.println("Primera evaluacion es verdadera y la segunda es falsa pero ni se la tendra en cuenta");

        }

        /**
         * JAVA tiene una evaluacion lazy, o tambien llamado evaluacion minima o de corto circuito
         */


    }


    static boolean comprobarEvaluacion() {
        System.out.println("Me estoy ejecutando");
        return true;
    }

    static boolean comprobarEvaluacionParaOr() {
        System.out.println("Me estoy ejecutando para OR");
        return true;
    }

    static boolean comprobarEvaluacionParaOrFalse() {
        System.out.println("Me estoy ejecutando para OR, retornare falso");
        return false;
    }
}