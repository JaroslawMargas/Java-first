package org.example.jetBrainsAcademy.lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class GetFirstAndLastElement {
    public static int[] getFirstAndLast(int[] numbers) {
        return new int[]{numbers[0], numbers[numbers.length - 1]};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));

    }
}
