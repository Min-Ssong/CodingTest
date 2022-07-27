var readline = require('readline'); 
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

function add(a, b){
    if(a < 0) return;
    if(b > 10) return;

    console.log(a + b);
}

r.question("", function(answer) { 
    answer_list = answer.split(" ");
    add(parseInt(answer_list[0]), parseInt(answer_list[1]));
    r.close();
});