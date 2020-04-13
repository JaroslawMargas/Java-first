package org.example.lesson01;

public class Second {

    public int number = 1;
    private int hiddenNumber = 42;

    public void doPrint(){
        System.out.println("Second");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void drinkBeer(Beer beer) {
        System.out.println("Dringing " + beer);
        beer = new Beer("Heineken");
        System.out.println("Dringing " + beer);
    }
}
