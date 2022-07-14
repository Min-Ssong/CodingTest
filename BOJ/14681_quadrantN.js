const { strictEqual } = require('assert');
var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let tmp = [];

r.on('line', (input) => {
    let NUM_IN = parseInt(input);
    if(NUM_IN != 0 && (NUM_IN >= -1000 && NUM_IN <= 1000)){
        tmp.push(NUM_IN);
        if(tmp.length == 2){
            const singX = Math.sign(tmp[0]);
            const singY = Math.sign(tmp[1]);
            
            if(singX == 1){
                console.log(singY == 1 ? 1 : 4);
            }else{
                console.log(singY == 1 ? 2 : 3);
            }
            r.close();
        }   
    }
});