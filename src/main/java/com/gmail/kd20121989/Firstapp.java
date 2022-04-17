package com.gmail.kd20121989;

import java.util.Random;

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
        doJavaHomework1();
    }

    static void getMaxIntNumber() {
        System.out.println("Max int value is: " + Integer.MAX_VALUE);
    }

    static int summ(int firstInt, int secondInt) {
        return firstInt + secondInt;
    }

    static void doJavaHomework1() {
        //Overflow
        System.out.println("Byte overflow looks like this: " + (byte)(Byte.MAX_VALUE + 1));
        System.out.println("Short overflow looks like this: " + (short)(Short.MAX_VALUE + 1));
        System.out.println("Int overflow looks like this: " + (Integer.MAX_VALUE + 1));
        System.out.println("Long overflow looks like this: " + (Long.MAX_VALUE + 1));
        System.out.println("Float overflow looks like this: " + (float)(Float.MAX_VALUE + 0.1));
        System.out.println("Double overflow looks like this: " + (double)(Double.MAX_VALUE + 0.01));
        
        //Underflow
        System.out.println("Byte underflow looks like this: " + (byte)(Byte.MIN_VALUE - 1));
        System.out.println("Short underflow looks like this: " + (short)(Short.MIN_VALUE - 1));
        System.out.println("Int underflow looks like this: " + (Integer.MIN_VALUE - 1));
        System.out.println("Long underflow looks like this: " + (Long.MIN_VALUE - 1));
        System.out.println("Float underflow looks like this: " + (Float.MIN_VALUE - 0.1));
        System.out.println("Double underflow looks like this: " + (Double.MIN_VALUE - 0.01));

        //Why it's not working for float and double?

        //Different data type operations
        Random random = new Random();
        System.out.println(random.nextInt() + random.nextFloat());
        System.out.println(random.nextInt() + random.nextLong());
        System.out.println(random.nextInt() + random.nextDouble());
        System.out.println(random.nextDouble() + random.nextFloat());

        //Operators
        int num1 = 10;
        int num2 = 20;
        System.out.println("First number is: " + num1 + " Second Number is: " + num2);
        num1+=2;
        System.out.println("First number after +=2 is: " + num1);
        num2-=2;
        System.out.println("Second number after -=2 is: " + num2);
        System.out.println(String.format("%s divided to %s is: " , num2, num1) + ((num2 / num1)));
        System.out.println("This is what left after divide operation " + (num2 % num1));

        //Logic operators
        if (num1 == num2) {
            System.out.println(num2 + " = " + num1);
        } else {
            if (num1 != num2) {
                System.out.println(num2 + " != " + num1);
            }
        }

        if (num1==12 && num2==12) {
            System.out.println("Both number is 12");
        } else {
            if (num1==12 || num2==12) {
                System.out.println("At least one of the numbers is 12");
            }
        }

        if ((num1 <= num2)) {
            System.out.println(num1 + " <= " + num2);
        } else {
            if (num1 > num2)
            System.out.println(num1 + " > " + num2);
        }

        if ((num1 >= num2)) {
            System.out.println(num1 + " < " + num2);
        } else {
            if (num1 < num2)
                System.out.println(num1 + " > " + num2);
        }

        if ("A String" instanceof String) {
            System.out.println("We have a String!");
        } else {
            System.out.println("Not a String...");
        }

    }

}
