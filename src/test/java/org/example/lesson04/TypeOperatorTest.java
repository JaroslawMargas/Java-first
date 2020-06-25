package org.example.lesson04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeOperatorTest {

    @Test
    void getLastDigitTest() {
        assertEquals(3,TypeOperator.getLastDigit(1234));
    }

    @Test
    void getTensTest() {
        assertEquals(3,TypeOperator.getTens(1234));
    }

    @Test
    void reverseFirstAndLastDigit() {
        assertEquals(321,TypeOperator.reverseFirstAndLastDigit(123));
    }

    @Test
    void countDesks() {
        int[] students = {1,2,3};
        assertEquals(4,TypeOperator.countDesks(students));
    }

    @Test
    void getLastTest() {
        assertEquals(4,TypeOperator.getLast(1234));
    }
}