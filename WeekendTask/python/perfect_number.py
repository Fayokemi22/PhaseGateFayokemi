#perfect number
number= 6
add = 0
for count in range(number):
	if(count % 2 == 0):
		add +=count

#	if sum is equal to the number used for division
	
if (add == number):
	print("It's a perfect number")
	
else:
	print("It is not a perfect number")


