var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

let count = 0;
let tmp = [];

function mul(tmp){
    let num1 = parseInt(tmp[0]);
    let units = tmp[1].charAt(tmp[1].length - 1);
    let tens = tmp[1].charAt(tmp[1].length - 2);
    let hundreds = tmp[1].charAt(tmp[1].length - 3);
    let result_units = num1 * units;
    let result_tens = num1 * tens;
    let result_hundreds = num1 * hundreds;
    let result = result_units + (result_tens * 10) + (result_hundreds * 100);

    console.log(`${result_units}
${result_tens}
${result_hundreds}
${result}`);
}

r.on('line', (input) => {
    tmp.push(input);
    count += 1;
    if (count === 2) {
        mul(tmp);
        r.close();
    }
});