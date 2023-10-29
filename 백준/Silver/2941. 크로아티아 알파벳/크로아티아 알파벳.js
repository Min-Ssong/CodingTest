let input = require("fs").readFileSync('/dev/stdin').toString().trim();
//let input = `ljes=njak`;
let croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z='];
for(let alpha of croatia){
    input = input.split(alpha).join('Q');
}
console.log(input.length);