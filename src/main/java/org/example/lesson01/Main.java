package org.example.lesson01;

import org.example.lesson02.CezarCipher;
import org.example.lesson03.InputScanner;
import org.example.lesson04.TypeOperator;
import java.util.Scanner;
import java.util.List;


public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Jonh !");

        var second = new Second();
        second.doPrint();
        System.out.println("Second " + second.number);
        second.setNumber(10);
        System.out.println("Second " + second.number);
        Beer beer = new Beer("Lech");
        second.drinkBeer(beer);
        System.out.println("Dringing in main " + beer);

        System.out.println(CezarCipher.encryptReverse("abcdefg hijklmno  pqrstuvwxyz!"));

        InputScanner inputExample = new InputScanner();
        System.out.println("Enter text to reverse");
        String input = inputExample.getAndPrint();
        System.out.println("Reversed: " + inputExample.reverseString(input));

        System.out.println("Enter three word to reverse order");
        inputExample.reverseThreeInput();

        System.out.println("Enter four line to display in order");
        List<String> list = inputExample.splitFromString();
        for (String s : list) System.out.println(s);

        TypeOperator typeTest = new TypeOperator();
        System.out.println("Result operation is: "+typeTest.getLastDigit( 12241));

        System.out.println("Enter int to count tens");
        int numToTens = scanner.nextInt();
        System.out.println("Tens is: "+typeTest.getTens( numToTens));

        System.out.println("Enter int(3) to reverse first and last digit");
        int numToRev = scanner.nextInt();
        System.out.println(typeTest.reverseFirstAndLastDigit(numToRev));

        System.out.println("Enter num of student in each class room");
        int classOne = scanner.nextInt();
        int classTwo = scanner.nextInt();
        int classThree = scanner.nextInt();
        int[] students = {classOne,classTwo,classThree};
        System.out.println(typeTest.countDesks(students));


    }
}
