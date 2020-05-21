package org.example.lesson10;

public class EnDysc {
    public static String encrypt(String text, int shift) {
        // use Unicode table [32-126] and shift
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int intUni = text.charAt(i);
            int newUni = intUni + shift;
            if (newUni > 126) {
                newUni = 31 + newUni - 126;
            }
            result.append((char) newUni);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // result should be \jqhtrj%yt%m~ujwxpnqq&
        String newText = encrypt("Welcome to hyperskill!", 5);
        System.out.println(newText);
    }
}