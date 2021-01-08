package org.example.Themes.Interface.Example02;

import java.util.Comparator;

public class ClassForStringComparator implements Comparator<Person> {

    // Each character of both the strings is converted into a Unicode value for comparison
    // ex."A" 97 - "A" 65 = -32
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
