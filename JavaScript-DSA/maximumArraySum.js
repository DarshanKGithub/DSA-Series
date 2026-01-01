let arr = [0,2,-5,4,-8,6,3,0,-5]

function findMaximumSubArraySum(arr){
    //Tack
    let currSum = arr[0];
    let maxSum = arr[1];

    for(let i = 0; i < arr.length; i++){
           currSum = Math.max(arr[i], currSum + arr[i]);
           maxSum = Math.max(maxSum,currSum);
    }
    return maxSum;
}

console.log(findMaximumSubArraySum(arr));