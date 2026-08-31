def greatestCommonFactor(firstNumber,secondNumber):
	greatestNumber=0
	for count in (firstNumber):
		if (firstNumber %count ==0 and secondNumber % count==0):
			greatestNumber = count
		return greatestNumber
		
	
def lowestCommonMultiple(firstNumber, secondNumber):

	return (firstNumber * secondNumber)/ greatestCommonFactor(firstNumber,secondNumber)

firstNumber= 12
secondNumber=8


print(lowestCommonMultiple(firstNumber,secondNumber))


	


