const prompt=require('prompt-sync')();

String letter = "abcdef";
let counter= 0;

for(let count=1; count<letter.length(); count++){

if (letter.charAt(0)==letter.charAt(count)){
counter++;
}

console(counter);


