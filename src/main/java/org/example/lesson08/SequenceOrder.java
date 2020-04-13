package org.example.lesson08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SequenceOrder {

    private static final Pattern PATTERN = Pattern.compile(" ");

    public static boolean checkSeq(String numberString) {
        String[] numbersArray = PATTERN.split(numberString);
        List<Integer> numbers = new ArrayList<>(numbersArray.length);
        List<Integer> sortedNumbers = new ArrayList<>();
        for (String s : numbersArray) {
            int i = Integer.parseInt(s);
            if (i == 0) {
                // zero ends input
                break;
            }
            numbers.add(i);
            sortedNumbers.add(i);
        }
        Collections.sort(sortedNumbers);
        if (numbers.equals(sortedNumbers)) {
            return true;
        }
        sortedNumbers.sort(Collections.reverseOrder());
        return numbers.equals(sortedNumbers);
    }

    public static void checkSeqScanner() {
        /*
        // this is the same task as "SequenceOrder" but with Scanner input and System.out.print
         */
        List<Integer> numbers = new ArrayList<>();
        List<Integer> sortedNumbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            num = sc.nextInt();
            if (num != 0) {
                numbers.add(num);
                sortedNumbers.add(num);
            }
        } while (num != 0);

        Collections.sort(sortedNumbers);
        if (numbers.equals(sortedNumbers)) {
            System.out.print(true);
        } else {
            sortedNumbers.sort(Collections.reverseOrder());
            System.out.print(numbers.equals(sortedNumbers));
        }
    }
}
