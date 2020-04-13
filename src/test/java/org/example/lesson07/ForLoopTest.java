package org.example.lesson07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForLoopTest {

    @Test
    void countAvgDivThree() {
        assertEquals(4.5, ForLoop.countAvgDivThree(-5,12));
        assertNotEquals(4.5, ForLoop.countAvgDivThree(-5,12));
    }
}