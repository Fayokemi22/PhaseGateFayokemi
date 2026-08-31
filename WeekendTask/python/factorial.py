def factorial_of_a_number(numbers):
	factorial=1
	for count in range(numbers,1,-1):
	
		factorial =factorial *count
	print(factorial)
	
		
number=int(input("Enter Number "))

factorial_of_a_number(number)
