package org.example.lesson10;

public class CountNumber {
    public static long power(int n, int m) {
        long result = 1;
        if (m != 0) {
            for (int i = 0; i < m; i++) {
                result *= n;
            }
        }
        return result;
    }
}
