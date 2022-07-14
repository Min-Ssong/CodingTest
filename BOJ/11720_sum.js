let input = require("fs").readFileSync('/dev/stdin').toString().trim().split('\n');
let result = 0;
input[1].split('').forEach(x => {
    result += parseInt(x);
});
console.log(result);