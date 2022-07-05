//let input = require('fs').readFileSync('/dev/stdin').toString().trim();
let input = `99`;
const N = Number(input);
let number = 0;
if(N/5 >= 1){
    let share_5 = N/5;
    let rest_5 = N%5;
    if(rest_5/3 >= 1){
        number = share_5 + Math.floor(rest_5/3) + Math.floor(rest_5%3);
    }else{
        number = share_5 + Math.floor(rest_5%3);
    }
}else{
    number = -1;
}

console.log(Math.floor(number));