const input = require("fs").readFileSync('/dev/stdin').toString().trim();
let str = '';
const T = parseInt(input.split('\n')[0]);
for(let i=1; i<=T; i++){
    let R = parseInt(input.split('\n')[i].split(' ')[0]);
    let S = input.split('\n')[i].split(' ')[1];
    for(let j=0; j<S.length; j++){
        str += S.split('')[j].repeat(R);
    }
    console.log(str);
    str = '';
}