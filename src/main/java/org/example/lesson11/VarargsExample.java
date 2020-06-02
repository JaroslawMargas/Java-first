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
}
