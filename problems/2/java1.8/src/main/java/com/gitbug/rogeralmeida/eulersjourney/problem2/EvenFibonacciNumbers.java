package com.gitbug.rogeralmeida.eulersjourney.problem2;

public class EvenFibonacciNumbers {


    public static void main(String[] args) {
        Integer number = 1;
        Integer previous = 0;
        Integer sum = 0;
        while (number < 4000000){
            if (number % 2 == 0){
                sum += number;
            }
            int current = number;
            number = previous + current;
            previous = current;
        }
        System.out.printf("The sum of even fibonacci numbers bellow 4kk is %d", sum);
    }
}
