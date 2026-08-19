
const prompt= require('prompt-sync')();
function years(fatherAge,sonAge){
return fatherAge -(sonAge *2);
}

function main() {
const fatherage = parseInt(prompt("Current Father's Age : "));
const sonAge = parseInt(prompt("Current Father's Age : "));

const year = years(fatherage, sonAge);



    console.log("The father would be twice older than his son in " + year+ " years");

}
main();



