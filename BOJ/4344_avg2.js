let input = require("fs").readFileSync('/dev/stdin').toString().trim();
let originArr = [];
let sumArr = [];
let sum = 0;
let answer = '';
for(let i=0; i<=parseInt(input.split('\n')[0]); i++){
    if(i != 0)
        originArr.push(input.split('\n')[i].split(' ').map(Number));
}
for(let i=0; i<originArr.length; i++){
    let numKind = originArr[i].shift();
    originArr[i].forEach(x =>{
        sum += x;
    });
    avg = sum/originArr[i].length;
    sum = 0;

    originArr[i].forEach(x => {
        if(x > avg){
            sum += 1;
        }
    });
    if(i != originArr.length-1){
        answer += `${((sum/numKind)*100).toFixed(3)}%\n`;
    }else{
        answer += `${((sum/numKind)*100).toFixed(3)}%`;
    }
    sum = 0;
}
console.log(answer);