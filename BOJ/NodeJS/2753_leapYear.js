var readline = require('readline'); 

// input, output 설정
var r = readline.createInterface({ 
    input:process.stdin, 
    output:process.stdout 
});

function leapYear(input){
    let year = parseInt(input);
    if(year < 1 || year > 4000){
        return;
    }

    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
        console.log("1");
    }else{
        console.log("0");
    }
}

r.on('line', (input) => {
    leapYear(input);
    r.close();
});
