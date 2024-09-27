export function lucky33(a, b){
     if((a + b === 33) || (a - b === 33) || (b - a === 33) || (a === 33 || b === 33)) return true;

     return false;
}

console.log(lucky33(9, 9));
