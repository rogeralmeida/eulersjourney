def F():
    a,b = 0,1
    while True:
        yield b
        a, b = b, a + b

def SubFib(startNumber, endNumber):
    for cur in F():
        if cur > endNumber: return
        if cur >= startNumber:
            yield cur

total = 0
for number in SubFib(1, 4000000):
    if number % 2 == 0:
        total += number
print "The sum of even numbers in fibonacci sequence bellow 4kk is {}".format(total)
