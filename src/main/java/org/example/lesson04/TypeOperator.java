package org.example.lesson04;

public class TypeOperator {

    public static int getLastDigit(int number) {
        return ((number % 100) / 10) % 10;
    }

    public static int getTens(int number) {
        return (number % 100) / 10;
    }

    public static int getLast(int number) {
        return (number % 100) % 10;
    }

    public static int reverseFirstAndLastDigit(int number) {
        // 123
        // /100 = 1
        // /10 = 12
        // %100 = 23
        // %10 =  3
        // %100/10 = 23 -> 2
        int one = number / 100;
        int two = (number % 100) / 10;
        int three = number % 10;
        return (three * 100) + (two * 10) + one;
    }

    public static int countDesks(int[] array) {
        // [1,2,3]
        // 1 - 1 desk in class
        // 2 - 1 desk in class
        // 3 - 2 desk in class
        int sum = 0;
        for (int itm : array) {
            sum += itm / 2 + itm % 2;
            // x/2 + rest from 2
        }
        return sum;
    }
}

