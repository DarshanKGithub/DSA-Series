let arr = [1,2,5,6,8,9,0,0,1,2,5,3,6];

function removeDuplicatesFromArray(arr){
   let sortedarr =  arr.sort((a,b) => a - b);
    let newArr = [];
    for(let i = 0; i < arr.length; i++){
        if(sortedarr[i] !== sortedarr[i + 1]){
            // sortedarr.remove();
            newArr.push(sortedarr[i]);
        }
    }
    return newArr;
}

console.log(removeDuplicatesFromArray(arr));