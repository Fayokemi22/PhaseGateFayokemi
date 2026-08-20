sum = 0
even = 0
for count in range(2,11):
	score = float(input("Enter score : "))
	sum += score
	if sum%2==0:
		even +=score

print("The even index is : " + str(even))






