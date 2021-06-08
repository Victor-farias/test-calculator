package com.test;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
public class AssertJTest {

    @Test
    public void checkEquality() {
        Calculator calculator = new Calculator();
        Calculator calculatorClone = calculator;

        assertThat(calculator).isEqualTo(calculatorClone);
    }

}
