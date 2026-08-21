const prompt= require('prompt-sync')();
let sum=0;
let even =0;

for (let count=2; count<=10; count++){
let score = parseFloat(prompt("Enter Score : "))
sum +=score;
if (sum%2==0){
even +=score;
}

}
}


console.log("The even  index is : " + even);



