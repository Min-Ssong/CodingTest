let input = require("fs").readFileSync('/dev/stdin').toString().trim();
let originArr = input.split('\n');
let count = 0; result = 0;
originArr.shift();
for(let i=0; i<originArr.length; i++){
    let tmp = originArr[i];
    for(let j=0; j<tmp.length; j++){
        if(tmp[j] == 'O'){
            if(count == 0)
                count = 1;
            else
                count += 1;
        }else
            count = 0;
        result += count;
    }
    console.log(result);

    count = 0;
    result = 0;
}