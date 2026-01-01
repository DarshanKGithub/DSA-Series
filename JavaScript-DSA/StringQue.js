/* You are given string "number" representing a positive integer and a character digit. Return the resulting string after removing exactly 
one occurance of digit from number such that value of the resulting string in decimal form is maximized. The test case are generated such that
digit occurs at least once in the number
i/p = "1321";
digit = "1"
*/

let number = "1321";
let digit = "1";

function stringOnceOccur(number, digit){
    for(let i = 0; i < number.length - 1; i++){
        if(number[i] === digit && number >=  digit){
            return number.slice(0,i) + number.slice( i + 1);
        }
    }

    //if not better position found remove last occurance
    let lastIndex = number.lastIndex(digit);
    return number.slice(0,lastIndex) + number.slice(lastIndex + 1);
}

console.log("Output: " + stringOnceOccur(number, digit));