package org.example.lesson08;

import java.util.ArrayList;
import java.util.List;

public class SequenceNum {
    public static List<Integer> countSequence(int num) {
        List<Integer> result = new ArrayList<>();
        boolean stop = false;
        int counter = 0;
        if (num > 0) {
            for (int i = 0; i <= num && !stop; i++) {
                for (int j = 0; j < i; ++j) {
                    if (counter == num) {
                        stop = true;
                        break;
                    }
                    result.add(i);
                    counter++;
                }
            }
        }
        return result;
    }
}

