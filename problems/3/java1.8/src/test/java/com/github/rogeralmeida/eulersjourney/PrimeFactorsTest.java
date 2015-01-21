package com.github.rogeralmeida.eulersjourney;

import java.util.Arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {

    @org.junit.Test
    public void calculate_shouldCalculate12() {
        assertThat(PrimeFactors.calculate(12), equalTo(Arrays.asList(2, 2, 3)));
    }

    @Test
    public void calculate_shouldCalculate315() {
        assertThat(PrimeFactors.calculate(315), equalTo(Arrays.asList(3, 3, 5, 7)));
    }

    @Test
    public void calculate_shouldCalculate360() {
        assertThat(PrimeFactors.calculate(360), equalTo(Arrays.asList(2, 2, 2, 3, 3, 5)));
    }

    @Test
    public void calculate_shouldCalculate13195() {
        assertThat(PrimeFactors.calculate(13195), equalTo(Arrays.asList(5, 7, 13, 29)));
    }
}
