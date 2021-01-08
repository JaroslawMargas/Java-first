package org.example.Themes.Interface.Example02;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        // Interface Comparator<Person> = new Class implements Comparator<Person>
        Comparator<Person> comparator = new ClassForStringComparator();

        Person one = new Person("ania");
        Person two = new Person("Ania");

        System.out.println(comparator.compare(one,two));

    }
}
