var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

r.on('line', (input) => {
    if(input >= 1 && input <= 9){
       for(let i=1; i<=9; i++){
           console.log(`${input} * ${i} = ${input * i}`);
       }
    }
    r.close();
});
