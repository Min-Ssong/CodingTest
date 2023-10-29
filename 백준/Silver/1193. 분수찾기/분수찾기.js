let input = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
//input = Number('5');
let counter = 0;

while (input > 0){
    counter++;
    input = input - counter;
}

if(counter % 2 === 0){
    console.log(`${counter + input}/${1 + -input}`);
}else{
    console.log(`${1 + -input}/${counter + input}`);
}