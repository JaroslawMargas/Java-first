package org.example.lesson05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalOperatorTest {

    @Test
    void checkNumberInRange() {
        assertTrue(RationalOperator.checkNumberInRange(5,2,7));
    }
}