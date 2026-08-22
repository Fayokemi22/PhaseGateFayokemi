function transactionLoginApp(){

const prompt = require('prompt-sync')()
let running = true;
while(running){

let intialDeposit = 0;

 menu = `
App menu :

1. deposit
2.	ithdraw
3. view the transaction
4. exit

 `;

console.log(menu)

let option =parseFloat(prompt("Enter Option: "));

 switch (option) {
case 1:

let deposit =parseFloat(prompt("Enter deposit amount: "));
let balance = intialDeposit + deposit 
console.log("You Deposited : " , deposit)
console.log("New balance is :", balance)
break;

  case 2:
console.log("Enter withdrawal amount : ");
let withdraw =parseInt(prompt("Enter amount: "));
let withdrawBalance = withdraw - intialDeposit
console.log("You withdrew : " + withdraw)
console.log("The New Balance is :", withdrawBalance)

break;

 case 3:  
 console.log("Transaction so far : ")
 
let transaction = balance - withdrawBalance;
let finalBalance = transaction;
console.log("The remaining transaction so far is :", transaction)
console.log("The final balance is :", finalBalance)
               

case 4:
running = false;
console.log("Thank you for choosing TransactionLoginapp");
	break;

default:
console.log("Invalid");
 }
 }
 }
 transactionLoginApp();

