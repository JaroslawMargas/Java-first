package org.example.lesson03;

import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class InputScanner {
    public Scanner inputScanner = new Scanner(System.in);

    public String getAndPrint() {
        return inputScanner.nextLine();
    }

    public String reverseString(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    public void reverseThreeInput() {

        String one = inputScanner.next();
        String two = inputScanner.next();
        String three = inputScanner.next();

        System.out.println(three);
        System.out.println(two);
        System.out.println(one);
    }

    public List<String> splitFromString() {
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Scanner input = new Scanner(System.in);
            String text = input.nextLine();
            String[] words = text.split(" ");
            Collections.addAll(resultList, words);
        }
        return resultList;
    }
}



