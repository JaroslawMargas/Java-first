package org.example.lesson08;

public class DoWhile {

    public static int countDepositInYear(double start, int percent, double expected) {
        int years = 0;
        double cashNow;
        double add;
        if (start != expected) {
            do {
                add = start * percent / 100;
                cashNow = start + add;
                start = cashNow;
                years++;
            } while (expected > cashNow);
        }
        return years;
    }
}
