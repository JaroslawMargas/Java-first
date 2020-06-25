package org.example.lesson05;

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
    }
}