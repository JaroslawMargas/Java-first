package org.example.lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNumberTest {

    @Test
    void power() {
        assertEquals(10000000000L,CountNumber.power(10,10));
        assertEquals(64,CountNumber.power(4,3));
        assertEquals(1,CountNumber.power(5,0));
    }
}