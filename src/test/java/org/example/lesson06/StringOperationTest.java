package org.example.lesson06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StringOperationTest {
    @Test
    public void testGetLengthRange() {
        assertEquals(5L, StringOperation.getLengthRange(" Inside Main", 0,6));
    }
    @Test
    public void  testReplaceOccurrences(){
        assertEquals("Alb hbs b cbt", StringOperation.replaceOccurrences("Ala has a cat", 'a', 'b'));
    }
    @Test
    void checkEqualsTwo() {
        assertTrue(StringOperation.compareTwoStringSpace("  string",
                "str ing "));
    }
}