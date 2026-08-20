const prompt= require('prompt-sync')();
let sum=0;
let average = 0

for (let count=1; count<=10; count++){
let score = parseFloat(prompt("Enter Score : "))
sum +=score;

}

average = score/10

console.log("The sum is : " + sum);
console.log("The average is : " + average);

