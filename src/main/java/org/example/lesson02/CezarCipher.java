package org.example.lesson02;

public class CezarCipher {
    /**
     * input text example: "aa bb !"
     * encrypted text "zz yy !"
     */
    public static StringBuffer encryptReverse(String text) {
        StringBuffer result = new StringBuffer();

        String mySimple = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                int idx = mySimple.indexOf(text.charAt(i));
                int newIdx = 25 - idx;
                char hash = mySimple.charAt(newIdx);
                result.append(hash);
            } else {
                result.append(text.charAt(i));
            }
        }
        return result;
    }

    public static String encryptShift(String text, int shift) {
        // String is immutable whereas StringBuffer and StringBuider are mutable classes.
        // StringBuffer is thread safe and synchronized whereas StringBuilder is not,
        // that is why StringBuilder is more faster than StringBuffer.
        StringBuilder result = new StringBuilder();

        String mySimple = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                int idx = mySimple.indexOf(text.charAt(i));
                int newIdx = idx + shift;
                if (newIdx > 25) {
                    newIdx -= 26;
                }
                char hash = mySimple.charAt(newIdx);
                result.append(hash);
            } else {
                result.append(text.charAt(i));
            }
        }
        return result.toString();
    }
}

