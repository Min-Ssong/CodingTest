//let input = require('fs').readFileSync('/dev/stdin').toString().split(' ');
let input = `1000 70 170`.split(' ');
let A = Number(input[0])
let B = Number(input[1])
let C = Number(input[2])

let N = A / (C-B);
let result = Math.floor(N) + 1;
console.log(B >= C ? -1 : result);