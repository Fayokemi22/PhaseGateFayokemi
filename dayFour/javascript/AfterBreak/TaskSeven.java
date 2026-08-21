const prompt= require('prompt-sync')();
let sum=0;
let even =0;

for (let count=1; count<=10; count++){
let score = parseFloat(prompt("Enter Score : "))
sum +=score;
if (sum%2==0){
even +=score;
}
average =even/10

console.log"The sum is is : " + sum);
console.log"The average is : " + average);

