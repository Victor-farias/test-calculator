package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int sum = calculator.sum("1+1+3");

        assertEquals(5, sum);
    }

    @Test
    public void sumTestWithMock() {
        Calculator calculator = mock(Calculator.class);

        when(calculator.sum("1 + 2")).thenReturn(10);

        int result = calculator.sum("1 + 2");

        assertEquals(10, result);
    }
}
