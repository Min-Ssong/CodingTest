const readline = require('readline');
const r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let answer = "";
r.on('line', (input) => {
    let tmp = input.split(" ");
    if(tmp.length === 2){
        let A = parseInt(tmp[0]);
        let B = parseInt(tmp[1]);
        answer += A+B+'\n';
    }
}).on('close', function(){
    console.log(answer);
    process.exit();
});