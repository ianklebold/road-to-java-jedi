package com.practice.datatypes;

public class FloatDoublesPrimitive 
{

    public static void main( String[] args )
    {
        //float tiene 32 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        
        System.out.println("Float minimum value : "+myMinFloatValue);
        System.out.println("Float maximum value : "+myMaxFloatValue);
        
        //double tiene 64 bits
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDDoubleValue = Double.MAX_VALUE;
        
        System.out.println("Double minimum value : "+myMinDoubleValue);
        System.out.println("Double maximum value : "+myMaxDDoubleValue);

        //Por defecto para Java todo numero con "." es un double
        //Estas 3 formas son lo mismo. Misma manera de indicar integer.
        int myIntValue = 5;
        double myDoubleValue = 5;
        float myFloatValue = 5;

        myIntValue = myIntValue/2;
        myDoubleValue = myDoubleValue/2;
        myFloatValue = myFloatValue/2;

        System.out.println("Integer value : "+myIntValue); //Devuelve el entero de la division
        //Devuelve un valor mucho mas preciso en division
        System.out.println("Double value : "+myDoubleValue);
        System.out.println("Float value : "+myFloatValue);

        /*
         * Float no es muy recomendable hoy en dia
         * Double es mas rapido de procesar en las computadoras de hoy en dia
         * Las bibliotecas de java implementan en sus funciones datos del tipo double y no float
         */
        
        myDoubleValue = 5/3; //Double es mucho mas preciso que Float
        myFloatValue = 5/3;
        System.out.println("Double value : "+myDoubleValue);
        System.out.println("Float value : "+myFloatValue);
        
        double numberOfPounts = 200d;
        double convertedKilograms = numberOfPounts * 0.45359237d;
        System.out.println("Converted to kilograms : "+convertedKilograms);


    }


}
 