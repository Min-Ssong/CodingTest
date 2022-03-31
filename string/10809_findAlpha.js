const input = require("fs").readFileSync('/dev/stdin').toString().trim();
let str = '';
for(let i = 97; i<=122; i++){
    str += input.indexOf(String.fromCharCode(i)) + ' ';
}
console.log(str);