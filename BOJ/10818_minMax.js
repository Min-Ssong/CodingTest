let input = require("fs").readFileSync('/dev/stdin').toString();
let tmp = input.split("\n")[1].split(' ').map(Number);
let maxNum = -1000001; minNum = 1000001;
for(let i=0; i<tmp.length; i++){
    if(maxNum < tmp[i]) maxNum = tmp[i];

    if(minNum > tmp[i]) minNum = tmp[i];
}
console.log(minNum, maxNum);

// Function.prototype.apply()을 사용하는 방식
console.log(Math.min.apply(null, tmp), Math.max.apply(null, tmp));

// Spread Operator(전개 연산자) 사용하는 방식
console.log(Math.min(...tmp), Math.max(...tmp));