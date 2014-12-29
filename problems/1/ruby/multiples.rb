sum = (1..999).select{|number| number % 3 == 0 or number % 5 == 0}.reduce(:+)
puts "The sum of multiples of 3 and 5 is #{sum}"
