let input = require("fs").readFileSync('/dev/stdin').toString();
let tmp = input.split("\n").map(Number);
let maxNum = -100; seq = 0;
for(let i=0; i<tmp.length; i++){
    if(maxNum < tmp[i]){
        maxNum = tmp[i];
        seq = i+1;
    }
}
console.log(`${maxNum}\n${seq}`);