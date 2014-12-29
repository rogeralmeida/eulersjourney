var sum = 0;
for(number = 1; number < 1000; number++){
	  if(number % 3 == 0 || number % 5 == 0){
			    sum += number;
					  }
}  
console.log("The sum of multiples of 3 and 5 bellow 1000 is "+sum);
