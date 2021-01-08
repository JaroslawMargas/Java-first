package org.example.jetBrainsAcademy.lesson10;

import java.util.Scanner;

public class EnDescription {
    public static String enDecrypt(String text, int shift, String encrypt) {
        // use Unicode table [32-126] and shift
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int intUni = text.charAt(i);
            int newUni = 0;
            if (encrypt.equals("enc")) {
                newUni = intUni + shift;
                if (newUni > 126) {
                    newUni = 31 + newUni - 126;
                }
            }
            if (encrypt.equals("dec")) {
                newUni = intUni - shift;
                if (newUni < 32) {
                    newUni = 126 - newUni + 32;
                }

            }
            result.append((char) newUni);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enc = sc.nextLine();
        String text = sc.nextLine();
        String shiftString = sc.nextLine();

        int shift = Integer.parseInt(shiftString.trim());

        String result = enDecrypt(text, shift, enc);
        System.out.println(result);
    }

}
