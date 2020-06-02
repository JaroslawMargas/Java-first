package org.example.lesson11;

public class VarargsExample {
    public static void printNumberOfArguments(int... numbers) {
        System.out.println(numbers.length);
    }

    public static void main (String []args){
        printNumberOfArguments(1);
        printNumberOfArguments(1,2,3);
        printNumberOfArguments(new int[] { 1, 2 });

    }

    // This example also demonstrates the difference between the arguments and parameters of a method.
    // The method has only a single parameter but it can be called with several arguments.

    // If a method has more than one parameter,
    // a vararg parameter must be the last parameter in the declaration of the method.

    // wrong is:
    // public static void printNumberOfArgumentsWrong(int... numbers, double x) {
    // }
}
