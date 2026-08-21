

const prompt = require('prompt-sync')();

const LetterX= parseFloat(prompt("Enter the first integer: "));
const LetterY= parseFloat(prompt("Enter the second integer: "));
const LetterZ= parseFloat(prompt("Enter the third integer: "));
    
    let mean = (LetterX+ LetterY + LetterZ)/ 3;
    
    let median = LetterY; 
    
    if (LetterX==median){
    
    console.log("The median is : " +LetterX);
    }
    
    else if (LetterZ==median){
    
    console.log("The median is : " + LetterZ);
    }
    else{
    console.log("The median is : " +LetterY);
    }

console.log("The mean is : "+ mean);    
        
