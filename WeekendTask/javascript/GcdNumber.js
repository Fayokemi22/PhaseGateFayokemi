const prompt=require('prompt-sync')();
function greatestCommonFactor(firstNumber,secondNumber){
	let greatestNumber=0;
		for(let count=1; count<=firstNumber; count++){
		 
			if (firstNumber %count ==0 && secondNumber % count==0){
				greatestNumber = count;
				}
	
	
		}
		return greatestNumber;
		
			
	}
let firstNumber=prompt("Enter First Number ")

let secondNumber= prompt("Enter Second Number ");



console.log(greatestCommonFactor(firstNumber,secondNumber));


