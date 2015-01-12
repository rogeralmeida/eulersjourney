package com.github.rogeralmeida.eulersjourney.problem2

object EvenFibonacciSum {

  def main(args: Array[String]) {
    lazy val fib: Stream[Int] = 0 #:: 1 #:: fib.zip(fib.tail).map { case (a, b) => a + b}
    var total = 0
    fib.filter(number => number % 2 == 0).toStream.takeWhile(number => number < 4000000).foreach(number => total += number)
    printf("The some of even numbers in fibonacci sequence bellow 4000 is %d", total)
    
  }

}
