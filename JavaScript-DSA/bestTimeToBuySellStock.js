
let arr = [7,1,5,3,6,4];


    function bestTimeToBuyAndSellStock(arr) {
    let minPrice = arr[0];
    let maxProfit = 0;

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < minPrice) {
            minPrice = arr[i];        // better day to buy
        } else {
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }
    }
    return maxProfit;
}



console.log(bestTimeToBuyAndSellStock(arr));