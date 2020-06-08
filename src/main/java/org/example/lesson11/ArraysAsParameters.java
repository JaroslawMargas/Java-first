package org.example.lesson11;

public class ArraysAsParameters {
    private static String name;

    private static void run(String[] args) {
        setName("Example");
        System.out.println(name);
        for (String itm : args) {
            System.out.println(itm);
        }
    }

    public static void setName(String name) {
        ArraysAsParameters.name = name;
    }

    public static void main(String[] args ){
        String[] argsVal = {"1", "2"};
        ArraysAsParameters.run(argsVal);
    }
}
