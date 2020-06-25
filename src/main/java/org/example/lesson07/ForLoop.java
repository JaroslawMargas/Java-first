package org.example.lesson07;

import java.util.Scanner;

public class ForLoop {
    public static void fizzBuzz(int start, int stop) {
        /*
        Fizz Buzz is a classic programming problem. Here is its slightly modified version.
        Write a program that takes the input of two integers:
        the beginning and the end of the interval (both numbers belong to the interval).
        The program is to output the numbers from this interval, but if the number is divisible by 3,
        you should output Fizz instead of it, if the number is divisible by 5, output Buzz,
        and if it is divisible both by 3 and by 5, output FizzBuzz.
        Output each number or word on a separate line.
         */
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
        /*
        There is a sequence of natural numbers, they do not exceed 30000.
        Find its maximum element divisible by 4. As input,
        the program first gets the number of elements in the sequence,
        and then the elements themselves. There is always an element divisible by 4 in the sequence.
        The number of elements does not exceed 1000.
        The program is to print the single number – the max element of the sequence divisible by 4.
         */
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
        /*
        Write a program that reads two numbers a  and b from the keyboard and calculates and outputs
        to the console the arithmetic average of all numbers from the interval [a;b],
        which are divisible by 3.

        In the example below, the arithmetic average is calculated for the numbers on the interval
        [−5;12]

        Total numbers divisible by 3 on this interval 6 : −3,0,3,6,9,12
        Their arithmetic average equals to 4.5

        The program input contains intervals, which always contain at least one number, which is divisible by 3.

        Remember that int type cannot contain fractions. Use double variable to store the precise
        result of the division.
         */
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
