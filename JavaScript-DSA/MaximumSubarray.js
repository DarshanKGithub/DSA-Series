let arr = [0,1,-9,6,3,-8,9,-6,3,-2,-1];

const maxSubArray = (arr) => {
    let currSum = arr[0];
    let maxSub = arr[0];
    for(let i = 1; i < arr.length; i++){
          currSum = Math.max(arr[i], currSum + arr[i]);
          maxSub = Math.max(maxSub, currSum);
    }
    return maxSub;
}

console.log(maxSubArray(arr));