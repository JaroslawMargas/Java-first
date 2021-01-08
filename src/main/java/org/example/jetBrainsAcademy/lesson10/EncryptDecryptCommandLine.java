package org.example.jetBrainsAcademy.lesson10;

public class EncryptDecryptCommandLine {
    public static void main(String[] args) {
        String mode = "";
        int shift = 0;
        String data = "";
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                mode = args[i + 1];
            }
            if (args[i].equals("-key")) {
                shift = Integer.parseInt(args[i + 1]);
            }
            if (args[i].equals("-data")) {
                data = args[i + 1];
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            int intUni = data.charAt(i);
            int newUni = 0;
            if (mode.equals("enc")) {
                newUni = intUni + shift;
                if (newUni > 126) {
                    newUni = 31 + newUni - 126;
                }
            }
            if (mode.equals("dec")) {
                newUni = intUni - shift;
                if (newUni < 32) {
                    newUni = 126 - newUni + 32;
                }
            }
            result.append((char) newUni);
        }
        System.out.print(result.toString());
    }
}
