let arr = [1,2,5,6,8,9,0,0,1,2,5,3,6];

// function containsDuplicate(arr){
//     for(let i = 0; i < arr.length; i++){
//         for(let j = i + 1; j < arr.length; j++){
//             if(arr[i] == arr[j]){
//                 return true;
//             }
            
//         }
//     }
//     return false;
// }

function containsDuplicate(arr){
    let set = new Set();
 
    for(let num of arr){
        if(set.has(num)) return true;
        set.add(num);
    }
    return false

        
}

console.log(containsDuplicate(arr));