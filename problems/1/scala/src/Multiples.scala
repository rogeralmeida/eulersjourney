object Multiples {
  def main (args: Array[String]) {
    val total = (1 to 999).toList.filter(number => number % 3 == 0 || number % 5 == 0).
      reduce[Int]((accumulator, number) => accumulator+number)
    printf("The sum of multiples of 3 and 5 bellow 1000 is %d", total);
  }

}
