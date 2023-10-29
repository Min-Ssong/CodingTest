const readline = require('readline');
const r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let answer = '';
r.on('line', (input) => {
    for(let i=parseInt(input); i>=1; i--){
        answer += i + '\n';
    }
}).on('close', function(){
    console.log(answer);
    process.exit();
});