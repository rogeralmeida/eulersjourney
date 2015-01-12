fib = Enumerator.new do |y|
	a = b = 1
	loop do
		y << a
		a, b = b, a + b
	end
end

total = fib.take_while{|number| number < 4000000}.select{|number| number%2 == 0}.reduce(:+)
p "The sum of even numbers in fibonacci sequence bellow 4000000 is #{total}"
