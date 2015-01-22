package com.github.rogeralmeida.eulersjourney;

import java.util.Arrays;
import java.util.Optional;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PrimeFactorsTest {

    @org.junit.Test
    public void calculate_shouldReturn223_whenNumberIs12() {
        assertThat(PrimeFactors.calculate(12l), equalTo(Arrays.asList(2l, 2l, 3l)));
    }

    @Test
    public void calculate_shouldReturn3357_whenNumberIs315() {
        assertThat(PrimeFactors.calculate(315l), equalTo(Arrays.asList(3l, 3l, 5l, 7l)));
    }

    @Test
    public void calculate_shouldReturn222335_whenNumberIs360() {
        assertThat(PrimeFactors.calculate(360l), equalTo(Arrays.asList(2l, 2l, 2l, 3l, 3l, 5l)));
    }

    @Test
    public void calculate_shouldReturn571329_whenNumberIs13195() {
        assertThat(PrimeFactors.calculate(13195l), equalTo(Arrays.asList(5l, 7l, 13l, 29l)));
    }

    @Test
    public void largest_shouldReturn3_whenNumberIs12() {
        validateLargest(12l, 3l);
    }

    @Test
    public void largest_shouldReturn7_whenNumberIs315() {
        validateLargest(315l, 7l);
    }

    @Test
    public void largest_shouldReturn5_whenNumberIs360() {
       validateLargest(360l, 5l);
    }

    @Test
    public void largest_shouldReturn29_whenNumberIs13195() {
        validateLargest(13195l, 29l);
    }

    private void validateLargest(Long number, Long expected) {
        Optional<Long> largest = PrimeFactors.largest(number);
        assertTrue(largest.isPresent());
        assertThat(largest.get(), equalTo(expected));
    }

}
