let arr = [0,5,6,9,3,6,0,8];
let target = 12;

function twoSum(arr,target){
    for(let i = 0; i < arr.length; i++){
         for(let j = i + 1; j < arr.length; j++ ){
            if(arr[i] + arr[j] == target){
                return [i,j];
            }
         }
    }
    return -1;
}

console.log(twoSum(arr,target));