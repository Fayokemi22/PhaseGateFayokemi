

let number={2,8,14,5,1};


for(let count=1; count<number.length; count++){
if( number[count]%2==0 ){
	number[count] *=2;
}

else{
number[count] +=1;
}
}


console.log(Arrays.toString(number));





