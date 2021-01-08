package org.example.jetBrainsAcademy.lesson07;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CubicEquationTest {

    @Test
    void cubicValueTrueTest() {
        List<Integer> listValues = Collections.singletonList(1);
        assertEquals(listValues,CubicEquation.CubicValue(-1,1,-1,1));
    }

    @Test
    void cubicValueFalseTest() {
        List<Integer> listValues = Arrays.asList(1,5);
        assertEquals(listValues,CubicEquation.CubicValue(0,1,-6,5));
    }
}