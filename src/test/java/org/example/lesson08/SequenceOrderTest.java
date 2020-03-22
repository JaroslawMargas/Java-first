package org.example.lesson08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SequenceOrderTest {

    @Test
    void checkSeq0() {
        assertTrue(SequenceOrder.checkSeq("9 8 7 6 5 4 3 2 1 0"));
    }

    @Test
    void checkSeq1() {
        assertTrue(SequenceOrder.checkSeq("1 2 3 4 5 6 7 8 9 0"));
    }

    @Test
    void checkSeq2() {
        assertFalse(SequenceOrder.checkSeq("1 2 6 4 5 0"));
    }

    @Test
    void checkSeq3() {
        assertTrue(SequenceOrder.checkSeq("9 8 7 6 5 4 0"));
    }

    @Test
    void checkSeq4() {
        assertFalse(SequenceOrder.checkSeq("9 8 7 3 5 4 0"));
    }

    @Test
    void checkSeq5() {
        assertTrue(SequenceOrder.checkSeq("1 1 3 4 5 0"));
    }

    @Test
    void checkSeq6() {
        assertTrue(SequenceOrder.checkSeq("1 2 3 3 4 0"));
    }

    @Test
    void checkSeq7() {
        assertTrue(SequenceOrder.checkSeq("9 9 7 6 5 4 0"));
    }

    @Test
    void checkSeq8() {
        assertTrue(SequenceOrder.checkSeq("9 8 7 7 5 4 0"));
    }

    @Test
    void checkSeq9() {
        assertTrue(SequenceOrder.checkSeq("1 1 1 1 1 1"));
    }

    @Test
    void checkSeq10() {
        assertTrue(SequenceOrder.checkSeq("1 2 3 4 0 1 2 3"));
    }

    @Test
    void checkSeq11() {
        assertTrue(SequenceOrder.checkSeq("0"));
    }
}
