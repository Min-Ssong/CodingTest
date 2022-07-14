var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

r.on('line', (input) => {
    let [H, M] = input.split(" ").map(Number);
    if((H >= 0 && H <= 23) && (M >= 0 && M <= 59)){
        M = M - 45;
        if(M < 0){
            M = M + 60;
            H -= 1;
            if(H < 0){
                H  = H + 24;
            }
        }
        console.log(H, M);
    }
    r.close();
});
