let arr = [0,1,2,4,7,8,9,0,0,6,5,0,];

const moveZeroToEnd = () =>{
     //index for tracking
     let idx = 0;
     
     //move non zero element forward
     for(let i = 0; i < arr.length; i++){
        if(arr[i] !== 0){
            arr[idx] = arr[i];
            idx++;
        }
     }

     // fill remaining elements
     while(idx < arr.length){
        arr[idx] = 0;
        idx++;
     }

     return arr;
}

console.log(moveZeroToEnd());