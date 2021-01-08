package org.example.jetBrainsAcademy.lesson11;

public class BasicCalculator {
    public static void main(String[]args){
        switch (args[0]) {
            case "+": {
                int res = Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
                System.out.println(res);
                break;
            }
            case "-": {
                int res = Integer.parseInt(args[1]) - Integer.parseInt(args[2]);
                System.out.println(res);
                break;
            }
            case "*": {
                int res = Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
                System.out.println(res);
                break;
            }
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
