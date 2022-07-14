const input = require("fs").readFileSync('/dev/stdin').toString().trim().toUpperCase().split('').sort();
let countArr = new Array(26).fill(0);
let count = 0;
let max = 0;
let wordAscii = 0;
for(let i=0; i<input.length; i++){
    let wordAlpha = input[i].charCodeAt(0)-65;
    countArr[wordAlpha]++;
}
for(let i=0; i<countArr.length; i++){
    if(countArr[i] >= max){
        if(countArr[i] === max){
            count++;
        }else{
            count = 0;
        }
        max = countArr[i];
        wordAscii = i;
    }
}
if(count === 0){
    console.log(String.fromCharCode(wordAscii+65));
}else{
    console.log('?');
}