package org.example.lesson08;

import java.util.ArrayList;
import java.util.List;

public class Collatz {
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
}
