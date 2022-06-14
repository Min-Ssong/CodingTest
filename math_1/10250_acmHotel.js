let input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

let nArrNumber = Number(n);
let newArr = arr.map((e) => e.split(" "));
let nAnswer = "";

for (let i = 0; i < nArrNumber; i++) {
  let H = newArr[i][0],
    N = newArr[i][2];

  let answerH = N % H;
  if (answerH === 0) {
    answerH = H;
  }

  let answerW = Math.ceil(N / H);
  answerW < 10 ? (answerW = String(0) + answerW) : answerW;

  nAnswer += `${answerH}${answerW}` + "\n";
}

console.log(nAnswer);