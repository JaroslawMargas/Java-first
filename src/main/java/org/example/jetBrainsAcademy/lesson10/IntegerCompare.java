package org.example.jetBrainsAcademy.lesson10;

public class IntegerCompare {
    public static int signSimple(int number) {
        if (number > 0) {
            return 1;
        } else if (number == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static int signBetter(int number) {
        return Integer.compare(number, 0);
    }



}

