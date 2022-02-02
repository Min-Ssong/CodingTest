var readline = require('readline');
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});


r.on('line', (input) => {
    if(input >= 1 && input <= 10000){
        let n = parseInt(input);
        let result = 0;
        for(let i=1; i<=n; i++){
            result += i;
        }
        console.log(result);
    }
});