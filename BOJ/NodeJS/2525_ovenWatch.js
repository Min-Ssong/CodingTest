let input = require("fs").readFileSync('/dev/stdin').toString().trim();
const setHour = parseInt(input.split('\n')[0].split(' ')[0]);
const setMin = parseInt(input.split('\n')[0].split(' ')[1]);
const addMin = parseInt(input.split('\n')[1]);

const fullTime = (setHour * 60) + setMin + addMin;
let resultHour = Math.floor(fullTime/60);
let resultMin = fullTime%60;

if(resultHour >= 24){
    resultHour = resultHour - 24;
}

console.log(resultHour, resultMin);