package org.example.lesson07;

import java.util.Scanner;

public class ForLoop {
    public static void fizzBuzz(int start, int stop) {
        if (stop > start) {
            for (; start <= stop; start++) {
                if (start % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (start % 3 == 0) {
                    System.out.println("Fizz");
                } else if (start % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(start);
                }
            }
        }
    }

    public static void fizzBuzzTwo(int start, int stop) {
        if (stop > start) {
            for (; start <= stop; start++) {

                String out = "";

                if (start % 3 == 0) {
                    out += "Fuzz";
                }
                if (start % 5 == 0) {
                    out += "Buzz";
                }
                if (out.isEmpty()) {
                    out = String.valueOf(start);
                }
                System.out.println(out);
            }
        }
    }

    public static int maxDivFour(int numQuantity) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < numQuantity; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > max) {
                max = number;
            }
        }
        return max;
    }

    public static float countAvgDivThree(int start, int stop) {
        int count = 0;
        int sum = 0;
        if (stop > start) {
            for (; start <= stop; start++) {
                if (start % 3 == 0) {
                    sum += start;
                    count += 1;
                }
            }
        }
        return (float) sum / count;
    }
}
