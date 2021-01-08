package org.example.jetBrainsAcademy.lesson05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSumTest {

    @Test
    void checkPairForSumTrue() {
        assertTrue(CheckSum.checkPairForSum(1,2,3,4));
    }
    @Test
    void checkPairForSumFalse() {
        assertFalse(CheckSum.checkPairForSum(1,2,3,7));
    }

    @Test
    void checkNumBetween() {
        // a >= b && a <= c || a >= c && a <= b;
        assertTrue(CheckSum.checkNumBetween(3,4,1));
    }
}