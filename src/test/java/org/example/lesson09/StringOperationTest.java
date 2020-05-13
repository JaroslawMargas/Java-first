package org.example.lesson09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOperationTest {

    @Test
    void checkOrderTest() {
        assertTrue(StringOperation.checkOrder("vwxyz"));
    }
    @Test
    void checkOrderFiledTest() {
        assertFalse(StringOperation.checkOrder("abd"));
    }

    @Test
    void checkOrderSpaceTest() {
        assertTrue(StringOperation.checkOrder(" "));
    }

    @Test
    void convertDate() {
        assertEquals("09/28/2012", StringOperation.convertDate("2012-09-28"));
    }

    @Test
    void checkHalfSumPositive() {
        assertEquals("YES", StringOperation.checkHalfSum("12344321"));
    }
    @Test
    void checkHalfSumNegative() {
        assertEquals("NO", StringOperation.checkHalfSum("125322"));
    }
}