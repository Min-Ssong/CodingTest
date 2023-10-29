let input = require("fs").readFileSync('/dev/stdin').toString().trim();
const firstDice = parseInt(input.split(' ')[0]);
const secondDice = parseInt(input.split(' ')[1]);
const thirdDice = parseInt(input.split(' ')[2]);

if(firstDice == secondDice){
    if(secondDice == thirdDice){
        // A == B == C
        console.log(10000+firstDice*1000);
    }else{
        // A == B != C
        console.log(1000+firstDice*100);
    }
}else if(firstDice == thirdDice){
    // A == C != B
    console.log(1000+firstDice*100);
}else{
    if(secondDice == thirdDice){
        // A != B == C
        console.log(1000+secondDice*100);
    }else{
        // A != B != C
        if(firstDice > secondDice){
            if(firstDice > thirdDice){
                console.log(firstDice * 100);
            }else{
                console.log(thirdDice * 100);
            }
        }else{
            if(secondDice > thirdDice){
                console.log(secondDice * 100);
            }else{
                console.log(thirdDice * 100);
            }
        }
    }
}