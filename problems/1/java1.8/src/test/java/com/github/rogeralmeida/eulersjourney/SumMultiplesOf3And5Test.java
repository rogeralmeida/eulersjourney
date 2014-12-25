package com.github.rogeralmeida.eulersjourney;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by ralmeid on 12/25/14.
 */
public class SumMultiplesOf3And5Test {

    @org.junit.Test
    public void sum_shouldReturn3_whenInvokedWithDouble3s() {
        SumMultiplesOf3And5 sumMultiplesOf3And5 = new SumMultiplesOf3And5();
        assertThat(sumMultiplesOf3And5.sum(3, 3), equalTo(3));

    }
}
