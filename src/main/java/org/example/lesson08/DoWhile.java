package org.example.lesson08;

import java.util.ArrayList;
import java.util.List;

public class DoWhile {
    public static List<Integer> collatz(int number) {
        List<Integer> list = new ArrayList<>();
        list.add(number);
        do {
            if (number != 1) {
                if (number % 2 != 0) {
                    number = (number * 3) + 1;
                } else {
                    number = number / 2;
                }
                list.add(number);
            }
        } while (number > 1);
        return list;
    }

    public static int countDepositInYear(double start, int percent, double expected) {
        int years = 0;
        double cashNow;
        double add;
        if (start != expected) {
            do {
                add = start * percent/100;
                cashNow = start + add;
                start = cashNow;
                years++;
            } while (expected > cashNow);
        }
        return years;
    }
}