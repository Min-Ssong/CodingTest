const readline = require('readline');
const r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let answer = "";
let tmp = [];
let isFrist = true;
let X = 0;
r.on('line', (input) => {
    tmp = input.split(" ");
    if(isFrist){
        X = parseInt(tmp[1]);
        isFrist = false;
    }else{
        for(let i=0; i<tmp.length; i++){
            if(X > parseInt(tmp[i])){
                answer += tmp[i] + ' ';
            }
        }
    }
}).on('close', function(){
    console.log(answer);
    process.exit();
});