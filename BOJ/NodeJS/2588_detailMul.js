var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let count = 0;
let tmp = [];

function mul(tmp){
    const A = parseInt(tmp[0]);
    const B = parseInt(tmp[1]);

    let units = B % 10;
    let tens = Math.floor((B % 100) / 10);
    let hundreds = Math.floor(B / 100);

    console.log(`${A * units}\n${A * tens}\n${A * hundreds}\n${A * B}`);
}

r.on('line', (input) => {
    tmp.push(input);
    count += 1;
    if (count === 2) {
        mul(tmp);
        r.close();
    }
});
