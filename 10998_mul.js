// readline 사용 선언
var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

function checkNum(str){
    let temp = [];

    answer_list = str.split(" ");
    
    a = parseInt(answer_list[0]);
    b = parseInt(answer_list[1]);

    if(a <= 0) return;
    if(b >= 10) return;
    temp.push(a, b);

    return temp;
}

function mul(a, b){
    console.log(a * b);
}

//readline을 이용한 질문 및 실행종료 조건 설정
r.question("", function(answer) {
    answer_num_list= checkNum(answer);
    mul(answer_num_list[0], answer_num_list[1]);

    r.close();
});