package org.example.lesson04;

public class TypeOperator {

    public static int getLastDigit(int number) {
        return ((number % 100) / 10) % 10;
    }

    public static int getTens(int number) {
        return (number % 100) / 10;
    }

    public static int getLast(int number){
        return (number % 100) % 10;
    }

    public static int reverseFirstAndLastDigit(int number) {
        int one = number / 100;
        int two = (number % 100) / 10;
        int three = number % 10;
        return (three * 100) + (two * 10) + one;
    }

    public static int countDesks(int[] array) {
        int sum = 0;
        for (int itm : array) {
            sum += itm / 2 + itm % 2;
        }
        return sum;
    }
}

