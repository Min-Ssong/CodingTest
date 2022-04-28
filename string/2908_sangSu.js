const input = require("fs").readFileSync('/dev/stdin').toString().trim().split(' ');
//const input = `734 893`.split(' ');
const numbers = [input[0], input[1]];

const chNum1 
    = numbers[0].split('')[2] 
    + numbers[0].split('')[1] 
    + numbers[0].split('')[0];

const chNum2 
    = numbers[1].split('')[2] 
    + numbers[1].split('')[1] 
    + numbers[1].split('')[0];

let result = chNum1 > chNum2 ? chNum1 : chNum2;
console.log(result);