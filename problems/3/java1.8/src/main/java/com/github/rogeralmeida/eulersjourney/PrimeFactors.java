package com.github.rogeralmeida.eulersjourney;

import java.util.ArrayList;
import java.util.Optional;

public class PrimeFactors {
    public static ArrayList<Long> calculate(Long number) {
        ArrayList<Long> result = new ArrayList<>();
        while (number%2 == 0){
            result.add(2l);
            number = number/2;
        }
        Long factor = 3l;
        while (factor <= Math.sqrt(number)){
            while (number%factor == 0){
                result.add(factor);
                number=number/factor;
            }
            factor+=2;
        }
        if (number > 2){
            result.add(number);
        }
        return result;
    }

    public static Optional<Long> largest(Long number) {
        return calculate(number).stream().max(Long::compare);
    }

    public static void main(String... args){
        System.out.printf("The largest prime factor of 600851475143 is %d", largest(600851475143l).get());
    }
}
