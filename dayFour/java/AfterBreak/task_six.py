sum = 0
even = 0
for count in range(1,11):
	score = float(input("Enter score : "))
	sum += score
	if sum%2==0:
		even +=score
average = even/10

print("The average  is : " + str(average))
