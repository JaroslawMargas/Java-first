package org.example.lesson05;

public class CheckSum {
    public boolean checkPairForSum(int a, int b, int c, int expectedSum){
        return a + b == expectedSum || a + c == expectedSum || b + c == expectedSum;
    }
    public boolean checkNumBetween (int a, int b, int c){
        return a>=b && a<=c || a>=c && a<=b ;
    }
}
