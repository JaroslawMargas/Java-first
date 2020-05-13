package org.example.lesson09;

public class StringOperation {
    public static boolean checkOrder(String str) {
        String mySimple = "abcdefghijklmnopqrstuvwxyz";
        char first = str.charAt(0);
        int index = mySimple.indexOf(first);
        boolean result = false;


        if (str.length() != 1) {
            for (int i = 0; i < str.length(); i++) {
                result = str.charAt(i) == mySimple.charAt(i + index);
            }
        } else {
            result = true;
        }
        return result;
    }

    public static String convertDate(String str) {
        String[] words = str.split("-");
        String result;
        result = words[1] + "/" + words[2] + "/" + words[0];
        return result;
    }

    public static String checkHalfSum(String str) {
        String result = "";
        int prevSum = 0;
        int tmpSum = 0;
        int stringLengthHalf = str.length() / 2;
        String[] parts = {str.substring(0, stringLengthHalf), str.substring(stringLengthHalf)};
        for (String part : parts) {
            for (char c : part.toCharArray()) {
                // example decimal value of character 5 is 53 and 0 is 48. So 53 - 48 = 5
                tmpSum += c - '0';
            }
            if (tmpSum == prevSum) {
                result = "YES";
            } else {
                prevSum = tmpSum;
                tmpSum = 0;
                result = "NO";
            }
        }
        return result;
    }
}
