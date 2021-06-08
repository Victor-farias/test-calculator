package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorNewTest {

    @Test
    public void mustSumTwoValues() {
        int valorA = 1;
        int valorB = 2;

        int soma = 0;

        NewCalculator calc = new NewCalculator();
        soma = calc.sum(valorA, valorB);

        assertEquals(3, soma);
    }

    @Test
    public void mustSumThreeValues() {
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        int soma = 0;

        NewCalculator calc = new NewCalculator();
        soma = calc.sum(valorA, valorB, valorC);

        assertEquals(6, soma);
    }

}
