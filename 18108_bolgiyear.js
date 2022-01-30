var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

r.question("", function(answer){
    numAnswer = parseInt(answer);
    if(numAnswer >= 1000 && numAnswer <= 3000){
        console.log(numAnswer - 543);
    }
    r.close();
});