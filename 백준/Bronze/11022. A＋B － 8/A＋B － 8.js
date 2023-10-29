const readline = require('readline');
const r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let answer = "";
let count = 0;
let result = [];
r.on('line', (input) => {
    let tmp = input.split(" ");
    if(tmp.length === 2){
        let A = parseInt(tmp[0]);
        let B = parseInt(tmp[1]);
        result.push([A, B]);
    }else{
        count = tmp[0];
    }
}).on('close', function(){
    for(i=0; i<count; i++){
        answer += `Case #${i+1}: ${result[i][0]} + ${result[i][1]} = ${result[i][0] + result[i][1]} \n`;
    }
    console.log(answer);
    process.exit();
});