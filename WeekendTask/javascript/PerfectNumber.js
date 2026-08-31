//perfect number

		let number= 6;
		let sum = 0;
		for(let count=0; count<number; count++){
	if(count % 2 == 0){
		sum +=count;
	
	}
	}
	//is sum is equal to the number used for division
	
	if (sum == number){
	console.log("It's a perfect number");
	}
else{
console.log("It is not a perfect number");
}
	



