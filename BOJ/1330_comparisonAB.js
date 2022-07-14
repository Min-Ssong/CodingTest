const { strictEqual } = require('assert');
var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

r.on('line', (input) => {
    const [A, B] = input.split(" ").map(Number);
    const result = A > B ? '>' : A < B ? '<' : '==';
    console.log(result);

    r.close();

});
