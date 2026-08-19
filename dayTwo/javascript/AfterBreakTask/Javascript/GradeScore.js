
const prompt = require('prompt-sync')();

function grade(average) {
    if (average <= 100) {
        return "A";
    } else if (average <=90) {
        return "B";
    } else if (average <=80) {
        return "C";
    } else if (average <=70) {
        return "D";
    } else {
        return "F";
    }
}

function main() {
    const scoreOne = parseFloat(prompt("First Score: "));
    const scoreTwo = parseFloat(prompt("Second Score: "));
    const scoreThree = parseFloat(prompt("Third Score: "));

    const average = (scoreOne + scoreTwo + scoreThree) / 3;

    console.log(grade(average));
    console.log("The Average is:"+ average);
}
main();




