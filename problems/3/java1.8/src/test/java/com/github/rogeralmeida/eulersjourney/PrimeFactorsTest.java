package com.github.rogeralmeida.eulersjourney;

import java.util.Arrays;
import java.util.Optional;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void largest_shouldReturn3_whenNumberIs12() {
        validateLargest(12, 3);
    }

    private void validateLargest(Integer number, int expected) {
        Optional<Integer> largest = PrimeFactors.largest(number);
        assertTrue(largest.isPresent());
        assertThat(largest.get(), equalTo(expected));
    }

    @Test
    public void largest_shouldReturn7_whenNumberIs315() {
        validateLargest(315, 7);
    }

    @Test
    public void largest_shouldReturn5_whenNumberIs360() {
       validateLargest(360, 5);
    }

    @Test
    public void largest_shouldReturn29_whenNumberIs13195() {
        validateLargest(13195, 29);
    }
}
