package com.practice.operators_logical_conditional;

public class IfThenStatement{
    public static void main(String[] args) {
    

        boolean isAlien = false;

        if(isAlien == false)
            System.out.println("It is not an alien!");

        
        
        if(isAlien == false);
            System.out.println("Esta linea se ejecuta sea como sea!");
        //Lo que pasa en el if anterior, es que queda nulado por el ";" que viene despues del condicional simple
        
        if(isAlien == false)
            System.out.println("Solo considero esta linea");
            System.out.println("Esta no"); //Para ejecutar esto necesito un code block

        if(isAlien == false){
            System.out.println("Solo considero esta linea");
            System.out.println("Ahora si");
        }
       

    }
}