package com.github.rogeralmeida.eulersjourney;

/**
 * Created by ralmeid on 12/25/14.
 */
public class SumMultiplesOf3And5 {

    public static void main(String... args){
        Integer sum = 0;
        for(int number=1; number < 1000; number++){
            if (number % 3 == 0 || number % 5 == 0){
                sum += number;
            }
        }
        System.out.printf("The sum of multiples of 3 and 5 below 1000 is %d", sum);
    }
}
