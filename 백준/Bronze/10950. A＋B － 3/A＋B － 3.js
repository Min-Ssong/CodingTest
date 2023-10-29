var readline = require('readline');
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let count = 0;
let result = [];
r.on('line', (input) => {
    result.push(input);
}).on('close', function(){
    count = parseInt(result.shift());
    for(let i=0; i<result.length; i++){
        let [A, B] = result[i].split(" ").map(Number);
        if((A > 0 && A < 10) && (B > 0 && B < 10)){
            console.log(A + B);
        }
    }
});