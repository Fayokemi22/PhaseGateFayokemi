const prompt= require('prompt-sync')();
let sum=0;

for (let count=1; count<=10; count++){
let score = parseFloat(prompt("Enter Score : "))
sum +=score;

}


console.log("The sum is : " + sum);

