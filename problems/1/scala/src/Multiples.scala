object Multiples {
  def main (args: Array[String]) {
    var number = 0;
    var sum = 0;
    for(number <- 1 to 999 if number % 3 == 0 || number % 5 == 0){
      sum += number;
    }
    printf("The sum of multiples of 3 and 5 bellow 1000 is %d", sum);
  }

}
