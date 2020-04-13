package org.example.lesson08;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DoWhileTest {

    @Test
    void collatzOneTest() {
        List<Integer> expected = List.of(1);
        assertEquals(expected, DoWhile.collatz(1));
    }

    @Test
    void collatzListTest() {
        List<Integer> expected = List.of(17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1);
        assertEquals(expected, DoWhile.collatz(17));
    }

    @Test
    void countDepositInYear() {
        assertEquals(2, DoWhile.countDepositInYear(100,15,120));
    }
}