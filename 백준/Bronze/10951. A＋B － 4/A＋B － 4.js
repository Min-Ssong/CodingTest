const readline = require('readline');
const r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let answer = "";
let tmp = [];
r.on('line', (input) => {
    let a = parseInt(input.split(" ")[0]);
    let b = parseInt(input.split(" ")[1]);
    answer += (a + b) + '\n';
}).on('close', function(){
    console.log(answer);
    process.exit();
});