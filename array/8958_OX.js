//let input = require("fs").readFileSync('/dev/stdin').toString().trim();
let input = `5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX`;
let originArr = input.split('\n');
originArr.shift();
for(let i=0; i<originArr.length; i++){
    let tmp = originArr[i];
    
}
// 1. originArr에서 한 줄씩 임시 배열에 저장
// 2. O -> 1 / X -> 0으로 치환
// 3. O면 앞자리 + 1로 해서 저장 / O인데 0번째 자리면 1