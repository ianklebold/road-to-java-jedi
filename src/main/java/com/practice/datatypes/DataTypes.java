package com.practice.datatypes;

public class DataTypes {
    //Clasificacion:
    /*
     * ->Primitives
     *           int
     *           byte
     *           short
     *           int   --> Pueden ser, decimal, 
     *                                 octal (Comienzan por cero con caracteres del 0-7), 
     *                                 hexadecimal(Comienzan por cero y X con caracteres del 0-F) 
     *                                 binario (Comienzan con 0b y luego la combinacion de 0 y/o 1)
     *           long
     *           float
     *           double
     *           char
     * 
     *->Objects
     */


    public void name() {
        //Los literales enteros y decimales se puede utilizar _ 
        int n = 2_345;
        double x = 45.2_345;
        System.out.println("Entero literal con _ "+n);
        System.out.println("Double con _ "+x);

        //Sin embargo lo siguiente no esta permitido:
        /*
        * int n = _345;
        * double d= 45._9;
        * long ln= 234_;
        */

    }


    int n = 2_345;
    long x = 2_345l; //Con la l podemos convertir de int en long


    double z = 43.2;
    float g= 43.2f; //Con la l podemos convertir de double a float
    //Float is of size 32 bits while double is of size 64 bits

    public void conversionTypes() {
        /*
         * Todos los tipos primitivos son convertribles en otros, salvo boolean
         * Todos los tipos de datos pueden convertirse a traves de CASTING excepto Boolean, boolean no se puede!
         */
        //Conversion implicita, es cuando realizamos asignaciones
        int x=45;
        double n =x;    
        
        //Conversion explicita, es cuando o bien realizamos 
        double z = 43.2;
        float g= 43.2f; //Con la l podemos convertir de double a float
        //O cuando hacemos:
        int y = (int)z; //casting
    }


}
