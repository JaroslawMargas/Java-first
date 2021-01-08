package org.example.jetBrainsAcademy.lesson11;

public class CommandLineMinMaxSum {
    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        switch (operator) {
            case "MIN": {
                int res = Integer.parseInt(args[1]);
                for (int i = 1; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) < res) {
                        res = Integer.parseInt(args[i]);
                    }
                }
                System.out.println(res);
                break;
            }
            case "MAX": {
                int res = Integer.parseInt(args[1]);
                for (int i = 1; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) > res) {
                        res = Integer.parseInt(args[i]);
                    }
                }
                System.out.println(res);
                break;
            }
            case "SUM": {
                int sum = 0;
                for (int i = 1; i < args.length; i++) {
                    sum += Integer.parseInt(args[i]);
                }
                System.out.println(sum);
                break;
            }
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}