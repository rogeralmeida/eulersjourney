package com.github.rogeralmeida.eulersjourney;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {

    @org.junit.Test
    public void calculate_shouldCalculate12() {
        assertThat(PrimeFactors.calculate(12), equalTo(Arrays.asList(2, 2, 3)));
    }
}
