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

    if(!(a >= 1) || !(b <= 10000)){
        return;
    }

    temp.push(a, b);

    return temp;
}

function add(a, b){
    console.log(a + b);
}

function minus(a, b){
    console.log(a - b);
}

function mul(a, b){
    console.log(a * b);
}

function div(a, b){
    console.log(Math.floor(a / b));
}

function rest(a, b){
    console.log(a % b);
}

//readline을 이용한 질문 및 실행종료 조건 설정
r.question("", function(answer) {
    answer_num_list= checkNum(answer);

    add(answer_num_list[0], answer_num_list[1]);
    minus(answer_num_list[0], answer_num_list[1]);
    mul(answer_num_list[0], answer_num_list[1]);
    div(answer_num_list[0], answer_num_list[1]);
    rest(answer_num_list[0], answer_num_list[1]);

    r.close();
});