package org.example.lesson07;

public class Conditional {
    public static String checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return ("Leap");
        } else {
            return ("Regular");
        }
    }

    public static boolean checkSymmetricalZeroLeft(int number, int expectedDigits) {
        String digits = Integer.toString(expectedDigits);
        String format  = "%0"+digits+"d";
        String padded = String.format(format , number);
        return padded.charAt(0) == padded.charAt(3) && padded.charAt(1) == padded.charAt(2);
    }
}

