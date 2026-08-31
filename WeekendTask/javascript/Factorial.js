const prompt=require('prompt-sync')();
	function factorialOfANumber(numbers){
	let factorial=1;
		for(let count=numbers; count>=1; count--){
	
	factorial =factorial *count;
	
	
		}
			console.log(factorial);
	}


let number=prompt("Enter Number ")

factorialOfANumber(number)



