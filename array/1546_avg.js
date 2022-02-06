let input = require("fs").readFileSync('/dev/stdin').toString().trim();
let tmp = input.split('\n')[1].split(' ').map(Number);
// 최댓값 구하기
let maxNum = -1;
tmp.forEach(x => {
    if(maxNum < x)
        maxNum = x;
});

// 새로운 배열
let newTmp = [];
let result = 0;
tmp.forEach(x => {
    result += x/maxNum*100;
});
console.log(result/tmp.length);