package org.example.lesson04;

public class TypeOperator {

    public int getLastDigit(int number) {
        return ((number % 100) / 10) % 10;
    }

    public int getTens(int number) {
        return (number % 100) / 10;
    }

    public int reverseFirstAndLastDigit(int number) {
        int one = number / 100;
        int two = (number % 100) / 10;
        int three = number % 10;
        return (three * 100) + (two * 10) + one;
    }

    public int countDesks(int[] array){
        int sum = 0;
        for (int itm:array){
            sum +=  itm/2 +itm%2;
        }
        return sum;
    }
}

