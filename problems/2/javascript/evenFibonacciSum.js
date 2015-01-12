function fib(n) {
  return function(n,a,b) {
    return n>0 ? arguments.callee(n-1,b,a+b) : a;
  }(n,0,1);
}
number = 0;
total = 0;
i = 0;
while (number < 4000000){
  number = fib(i++);
  if(number%2 == 0){
    total += number;
  }
}

console.log("The sum of even numbers in fibonacci sequence bellow 4kk is "+total);
