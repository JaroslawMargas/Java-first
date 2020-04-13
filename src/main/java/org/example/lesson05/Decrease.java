package org.example.lesson05;

import java.util.Scanner;

public class Decrease {
    public static String decreaseIntInputsToString(){
        Scanner inputScanner = new Scanner(System.in);
        int one = inputScanner.nextInt();
        int two = inputScanner.nextInt();
        int three = inputScanner.nextInt();
        int four = inputScanner.nextInt();
        return --one+" "+--two+" "+--three+" "+--four;
    }

}
