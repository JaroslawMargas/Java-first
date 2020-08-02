package org.example.Lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// code owner https://craftincode.com/- this is an example how anonym class and lambda works.

class ExampleAClassAndLambda {
    public static void main(String[] args) {
        List<String> sampleStrings = Arrays.asList("ala", "ma", "kota", "a", "kot", "ma", "Alicje");
        System.out.println(filterStartingWithA(sampleStrings)); // [ala, a, Alicje]
        System.out.println(filterLongerThan3(sampleStrings)); // [kota, Alicje]

        // anonym class
        Criteria shorterThan4Criteria = new Criteria() {
            @Override
            public boolean isOk(String text) {
                if (text.length() < 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        System.out.println(filterStrings(sampleStrings, shorterThan4Criteria)); // [ala, ma, a, kot, ma]

        // lambda
        Criteria endingWithACriteria = (s) -> {
            if (s.toLowerCase().endsWith("a")) {
                return true;
            }
            return false;
        };


        System.out.println(filterStrings(sampleStrings, endingWithACriteria)); // [ala, ma, kota, a, ma]
    }

    public static List<String> filterStrings(List<String> strings, Criteria criteria) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (criteria.isOk(string)) {
                result.add(string);
            }
        }
        return result;
    }

    public static List<String> filterStartingWithA(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (string.toUpperCase().startsWith("A")) {
                result.add(string);
            }
        }
        return result;
    }

    public static List<String> filterLongerThan3(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > 3) {
                result.add(string);
            }
        }
        return result;
    }

    public interface Criteria {
        boolean isOk(String text);
    }
}
