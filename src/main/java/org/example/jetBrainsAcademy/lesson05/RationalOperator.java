package org.example.jetBrainsAcademy.lesson05;

public class RationalOperator {
    public static boolean checkNumberInRange(int number, int moreThen, int lessThen) {
        // check if number is range (less, more)
        return number < lessThen && number > moreThen;
    }
}
