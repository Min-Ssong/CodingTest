let input = parseInt(require("fs").readFileSync('/dev/stdin').toString());
let units = 0; tens = 0; count = 1; result = 0; firstNum = 0; number = 0;
firstNum = input;
while(input !== number){
    tens = Math.floor(parseInt(input) / 10);
    units = parseInt(input) % 10;
    result = tens + units;
    number = units.toString() + (result % 10).toString();

    if(firstNum !== parseInt(number)){
        input = parseInt(number);
    }else{
        break;
    }
    count += 1;
}
console.log(count);