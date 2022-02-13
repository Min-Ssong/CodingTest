function d(num){
    let a = String(num).split('');
    let sum = num;
    a.forEach(x => {
        sum += parseInt(x);
    });
    return sum;
}

let creators = [];
let selfNumbers = [];
for(let i=1; i<=10000; i++){
    selfNumbers.push(i);
    creators.push(d(i));
}

for(let i=0; i<selfNumbers.length; i++){
    for(let j=0; j<creators.length; j++){
        if(selfNumbers[i] == creators[j]){
            selfNumbers.splice(i, 1);
            i -= 1;
        }
    }
}

let answer = '';
for(let i=0; i<selfNumbers.length; i++){
    if(i != selfNumbers.length-1){
        answer += selfNumbers[i] + '\n';
    }else{
        answer += selfNumbers[i];
    }
}
console.log(answer);