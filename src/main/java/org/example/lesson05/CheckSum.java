package org.example.lesson05;

public class CheckSum {
    public static boolean checkPairForSum(int a, int b, int c, int expectedSum) {
        // check if its possible crate a pair from numbers equals expected sum
        return a + b == expectedSum || a + c == expectedSum || b + c == expectedSum;
    }

    public static boolean checkNumBetween(int a, int b, int c) {
        return a >= b && a <= c || a >= c && a <= b;
    }
}
