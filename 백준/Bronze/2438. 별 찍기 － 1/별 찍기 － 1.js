const readline = require('readline');
const r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let answer = '';
r.on('line', (input) => {
    for(let i=1; i<=input; i++){
        answer += '*'.repeat(i)+'\n';
    }
}).on('close', function(){
    console.log(answer);
    process.exit();
});