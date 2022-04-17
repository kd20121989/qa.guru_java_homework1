package com.gmail.kd20121989;

import jdk.jfr.Unsigned;

public class Firstapp {
    public static void main(String[] args) {

        char letter, bigLetter;
        letter = 'o';
        bigLetter = 'O';

        char[] array = new char[3];
        char[] initializedArray = new char[]{'i', 'n', 'i', 't'};
        char[][] twoDimensionalArray = new char[][]
                {{'i', 'n', 'i', 't'}, {'c', 'o', 'm', 'm', 'i', 't'}};

        boolean trigger = false;

        byte myByte = 120;
        short myShort;
        int myInt;
        Integer boxed = null;
        long myLong = 120L;

        float myFloat = 1.2F;
        double myDouble = 1.2D;

        String myString;

        getMaxIntNumber();
        System.out.println(summ(myByte, (int) myLong));
    }

    static void getMaxIntNumber() {
        System.out.println("Max int value is: " + Integer.MAX_VALUE);
    }

    static int summ(int firstInt, int secondInt) {
        return firstInt + secondInt;
    }

}
