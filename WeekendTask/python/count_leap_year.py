counter=0
for count in range(1900,2025):

		if(count%4==0 and(count%100 !=0 or count%400==0)):
			counter+=1


print(counter)

