var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let count = 0;
r.on('line', (input) => {
    let tmp = [];
    if(input.indexOf(" ") != -1){
        const [A, B] = input.split(" ").map(Number);
        if((A > 0 && A < 10) && (B > 0 && B < 10)){
            console.log(A + B);
        }
    }else{
        count = input;
    }
    
    r.close();
});