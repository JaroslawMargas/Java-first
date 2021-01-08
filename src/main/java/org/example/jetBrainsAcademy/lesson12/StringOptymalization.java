package org.example.jetBrainsAcademy.lesson12;

public class StringOptymalization {
    public static void main(String[] args){

        String s = "a";

        long startOne = System.nanoTime();
        for(int i=0; i<10000; i++) {
            s = s + "a";
        }
        System.out.println("Time1: "+(System.nanoTime()-startOne));
        System.out.println(s);

        // Time1: 80 595 300

        String s2 = "b";

        long startTwo = System.nanoTime();
        StringBuilder sB = new StringBuilder(s2);
        for(int i=0; i<10000; i++) {
            sB.append("b");
        }

        s2 = sB.toString();
        System.out.println("Time2: "+(System.nanoTime()-startTwo));
        System.out.println(s2);

        //Time2: 2 327 700


    }
}
