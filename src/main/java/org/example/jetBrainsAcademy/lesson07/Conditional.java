package org.example.jetBrainsAcademy.lesson07;

public class Conditional {
    public static String checkLeapYear(int year) {
        /*
        Find whether the given year is a leap year.
        Just a reminder: leap years are those years in which the year’s number is either divisible by 4,
        but not divisible by 100, or divisible by 400 (for example, the year 2000 is a leap year,
        but the year 2100 will not be a leap year).
        The program should work correctly for the years 1900 ≤ n ≤ 3000.
        Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.
        It is enough to write a simple conditional statement to solve this task.
         */
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return ("Leap");
        } else {
            return ("Regular");
        }
    }

    public static boolean checkSymmetricalZeroLeft(int number, int expectedDigits) {
        /*
        Given a four-digit number. Determine whether its decimal notation is symmetric.
        If the number is symmetric, output TRUE; otherwise FALSE.
        The number may have less than four digits; in this case you should assume that
        its decimal notation is complemented by insignificant zeros on the left.
         */
        String digits = Integer.toString(expectedDigits);
        String format = "%0" + digits + "d";
        String padded = String.format(format, number);
        return padded.charAt(0) == padded.charAt(3) && padded.charAt(1) == padded.charAt(2);
    }
}

