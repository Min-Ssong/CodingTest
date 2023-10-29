const { strictEqual } = require('assert');
var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

function grade(input){
    let score = parseInt(input);
    if(score < 0 || score > 100){
        return;
    }

    if(score >= 90){
        console.log("A");
    }else if(score >= 80 && score <= 89){
        console.log("B");
    }else if(score >= 70 && score <= 79){
        console.log("C");
    }else if(score >= 60 && score <= 69){
        console.log("D");
    }else{
        console.log("F");
    }
}

r.on('line', (input) => {
    grade(input);
    r.close();
});
