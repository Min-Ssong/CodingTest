var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

function returnArray(answer){
    let list_answer = [];
    let tmep_list = answer.split(" ");
    for(let i=0; i<tmep_list.length; i++){
        if(tmep_list[i] >= 2 && tmep_list[i] <= 10000){
            list_answer[i] = parseInt(tmep_list[i]);
        }else{
            return;
        }
    }
    return list_answer;
}

r.question("", function(answer){
    let tmp_list = returnArray(answer);
    let a = tmp_list[0];
    let b = tmp_list[1];
    let c = tmp_list[2];

    console.log( (a+b)%c );
    console.log( ((a%c) + (b%c))%c );
    console.log( (a*b)%c );
    console.log( ((a%c) * (b%c))%c );

    r.close();
});