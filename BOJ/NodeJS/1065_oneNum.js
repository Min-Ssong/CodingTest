let input = require("fs").readFileSync('/dev/stdin').toString().trim();
let count = 0;
function oneNum(num){
    for(let i=1; i<=num; i++){
        if(i < 100){
            count += 1;
        }else{
            let hundredsMtens = Math.floor(i/100) - Math.floor((i/10)%10);
            let tensMunits = Math.floor((i/10)%10) - Math.floor(i%10);
            if(hundredsMtens == tensMunits){
                count += 1;
            }
        }
    }
    console.log(count);
}
oneNum(input);