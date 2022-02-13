//let input = require("fs").readFileSync('/dev/stdin').toString().trim();
let input = `5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91`;
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
// 1. 점수로만 이뤄진 배열 만들기
// 2. 평균 구하기
// 3. 점수 중에서 평균보다 큰 점수의 비율 구하기