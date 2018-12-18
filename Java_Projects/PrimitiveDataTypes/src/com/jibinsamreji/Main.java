package com.jibinsamreji;

public class Main {
    //Excercise 1
    public static void main(String[] args) {

        //Creating a byte Variable and set it with any value.
        byte myByteVar= 121;

        //Creating a short Variable and set it with any value.
        short myShortVar= 3277;

        //Creating a int Variable and set it with any value.
        int myIntVar=10;

        //Creating a long Variable and set it with any value.
        long myLongVar;
        myLongVar=(long)5000L+10L*(myByteVar+myIntVar+myShortVar);
        System.out.println("Total:" + myLongVar);

        //float and double varibales

        float totalPounds= 100f;
        double kilogram= (double) totalPounds* 0.45359237;
        System.out.println("Total Kg:"+ kilogram);
    }
}
