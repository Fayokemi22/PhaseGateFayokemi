function greatestCommonFactor(firstNumber,secondNumber){
	let greatestNumber=0;
		for(let count=1; count<=firstNumber; count++){
		 
			if (firstNumber %count ==0 && secondNumber % count==0){
				greatestNumber = count;
				}
	
	
		}
		return greatestNumber;
		
}	
function lowestCommonMultiple(firstNumber, secondNumber){

return (firstNumber * secondNumber)/ greatestCommonFactor(firstNumber,secondNumber);
}


	let firstNumber= 12
	let secondNumber=8


console.log(lowestCommonMultiple(firstNumber,secondNumber));


	


