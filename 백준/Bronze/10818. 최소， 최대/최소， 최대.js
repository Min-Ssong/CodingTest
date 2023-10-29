let input = require("fs").readFileSync('/dev/stdin').toString();
let tmp = input.split("\n")[1].split(' ').map(Number);
console.log(Math.min.apply(null, tmp), Math.max.apply(null, tmp));