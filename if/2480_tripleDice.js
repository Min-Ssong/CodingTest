let input = require("fs").readFileSync('/dev/stdin').toString().trim();
const firstDice = parseInt(input.split(' ')[0]);
const secondDice = parseInt(input.split(' ')[1]);
const thirdDice = parseInt(input.split(' ')[2]);
let str;

if(firstDice == secondDice){
    if(secondDice == thirdDice){
        // A == B == C
        str = 10000+firstDice*1000;
    }else{
        // A == B != C
        str = 1000+firstDice*100;
    }
}else if(firstDice == thirdDice){
    // A == C != B
    str = 1000+firstDice*100;
}else{
    if(secondDice == thirdDice){
        // A != B == C
        str = 1000+secondDice*100;
    }else{
        // A != B != C
        if(firstDice > secondDice){
            if(firstDice > thirdDice){
                str = firstDice * 100;
            }else{
                str = thirdDice * 100;
            }
        }else{
            if(secondDice > thirdDice){
                str = secondDice * 100;
            }else{
                str = thirdDice * 100;
            }
        }
    }
}
console.log(str);