package org.example.jetBrainsAcademy.lesson12;

public class StringType {

    public static void main(String[] args) {
        stringOne();
        stringTwo();
        // give the same result
        // Kasia i Tomek
        //Kasia i Tomek
    }

    private static void stringOne() {
        String s = "Kasia";
        s = s + " and Tomek";
        System.out.println(s);
    }

    private static void stringTwo() {
        String s = "Kasia";
        s = new StringBuilder(s).append(" and Tomek").toString();
        System.out.println(s);
    }
}
