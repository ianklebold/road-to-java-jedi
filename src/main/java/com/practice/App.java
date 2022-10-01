package com.practice;

public class App 
{
    private byte byteNumber;
    private short shortNumber;
    private int intNumber;
    private long longNumber = 50_000;
    public static void main( String[] args )
    {
     
     //Integer ocupa 8 bits
     byte myMaxByteValue = Byte.MAX_VALUE;
     byte myMinByteValue = Byte.MIN_VALUE;
     
     
     System.out.println("BYTE MAX VALUE :"+myMaxByteValue);
     System.out.println("BYTE MIN VALUE :"+myMinByteValue);
     
     //Integer ocupa 16 bits
     short myMaxShortValue = Short.MAX_VALUE;
     short myMinShortValue = Short.MIN_VALUE;

     System.out.println("SHORT MAX VALUE :"+myMaxShortValue);
     System.out.println("SHORT MIN VALUE :"+myMinShortValue);

      //Integer ocupa 32 bits
      int myMaxIntValue = Integer.MAX_VALUE;
      int myMinIntValue = Integer.MIN_VALUE;
      
     System.out.println("INTEGER MAX VALUE :"+myMaxIntValue);
     System.out.println("INTEGER MIN VALUE :"+myMinIntValue);

     int myMaxIntTest = 2_147_483_647;     

     //Long ocupa 64 bits
     long myMaxLongValue = Long.MAX_VALUE;
     long myMinLongValue = Long.MIN_VALUE;

     System.out.println("LONG MAX VALUE :"+myMaxLongValue);
     System.out.println("LONG MIN VALUE :"+myMinLongValue);

     //Challenge!

           
    }

    private byte setAValidByteNumber(byte byteNumber) {
        if(byteNumber > Byte.MAX_VALUE || byteNumber < Byte.MIN_VALUE){
            System.out.println("Error. The byte number input is not valid");
            return this.byteNumber;
        }else{
            return this.byteNumber = byteNumber;
        }
    }

    private short setAValidShortNumber(short shortNumber) {
        if(shortNumber > Short.MAX_VALUE || shortNumber < Short.MIN_VALUE){
            System.out.println("Error. The short number input is not valid");
            return this.shortNumber;
        }else{
            return this.shortNumber = shortNumber;
        }
    }

    private int setAValidIntNumber(int intNumber) {
        if(intNumber > Short.MAX_VALUE || intNumber < Short.MIN_VALUE){
            System.out.println("Error. The integer number input is not valid");
            return this.intNumber;
        }else{
            return this.intNumber = intNumber;
        }
    }


    private Long convertLongValue(long value){
        if ((this.longNumber + 10*(this.shortNumber + this.byteNumber)) > Long.MAX_VALUE ) {
            System.out.println("Error. The long number is not valid");
            return this.longNumber;
        }else{
            return this.longNumber += 10*(this.shortNumber + this.byteNumber);
        }
    }
}
