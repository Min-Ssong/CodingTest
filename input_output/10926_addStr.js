// readline 사용 선언
var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

r.question("", function(answer) {
    if( answer.length <= 50 ){
        // 배열에 넣고 소문자 검사
        for(let i=0; i<answer.length; i++){
            if( 97 > answer.charCodeAt(i) || answer.charCodeAt(i) > 122 ){
                return;
            }
        }
        console.log(answer + "??!");
    }else{
        return;
    }


    r.close();
});