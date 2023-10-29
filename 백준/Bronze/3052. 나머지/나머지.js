let input = require("fs").readFileSync('/dev/stdin').toString().trim().split("\n").map(Number);
let secondArr = [];
input.forEach(x =>{
    let num = x % 42;
    if(secondArr.indexOf(num) === -1){
        secondArr.push(num);
    }
});
console.log(secondArr.length);