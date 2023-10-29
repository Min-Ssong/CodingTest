const input = require("fs").readFileSync('/dev/stdin').toString().trim();
//const input = `UNUCIC`;
let finalTime = 0;
for(let i=0; i<input.length; i++){
    let charAscii = input.charCodeAt(i);
    if(65 <= charAscii && charAscii <= 67){
        finalTime += 3;
    }else if(68 <= charAscii && charAscii <= 70){
        finalTime += 4;
    }else if(71 <= charAscii && charAscii <= 73){
        finalTime += 5;
    }else if(74 <= charAscii && charAscii <= 76){
        finalTime += 6;
    }else if(77 <= charAscii && charAscii <= 79){
        finalTime += 7;
    }else if(80 <= charAscii && charAscii <= 83){
        finalTime += 8;
    }else if(84 <= charAscii && charAscii <= 86){
        finalTime += 9;
    }else if(87 <= charAscii && charAscii <= 90){
        finalTime += 10;
    }
}
console.log(finalTime);