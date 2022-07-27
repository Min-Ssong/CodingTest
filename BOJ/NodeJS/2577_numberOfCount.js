let input = require("fs").readFileSync('/dev/stdin').toString();
let [A, B, C] = input.split("\n").map(Number);
let mulResult = (A * B * C).toString().split('');
let answer = '';
for(let i=0; i<10; i++){
    count = 0;
    for(let j=0; j<mulResult.length; j++){
        if(parseInt(mulResult[j]) === i){
            count += 1;
        }
    }
    answer += count + '\n';
}
console.log(answer);