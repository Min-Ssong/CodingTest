const input = require("fs").readFileSync('/dev/stdin').toString().trim().split(' ');
//const input = `734 893`.split(' ');

const chNum1 
    = input[0].split('')[2] 
    + input[0].split('')[1] 
    + input[0].split('')[0];

const chNum2 
    = input[1].split('')[2] 
    + input[1].split('')[1] 
    + input[1].split('')[0];

let result = chNum1 > chNum2 ? chNum1 : chNum2;
console.log(result);