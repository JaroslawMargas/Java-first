package org.example.lesson08;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SequenceNumTest {

    @Test
    void countSequence() {
        List<Integer> expected = List.of(1, 2, 2, 3, 3, 3, 4);
        assertEquals(expected, SequenceNum.countSequence(7));
    }
}