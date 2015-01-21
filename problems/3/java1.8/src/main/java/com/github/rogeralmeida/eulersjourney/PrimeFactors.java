package com.github.rogeralmeida.eulersjourney;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> calculate(Integer number) {
        ArrayList<Integer> result = new ArrayList<>();
        while (number%2 == 0){
            result.add(2);
            number = number/2;
        }
        Integer factor = 3;
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
}
