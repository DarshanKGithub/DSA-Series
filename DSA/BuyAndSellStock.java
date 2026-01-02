/*
Best time to Buy and Sell Stock
*/

package DSA;

public class BuyAndSellStock {
  
    //Brute force approach
    // public static int getMaxProfit(int[] prices){
    //     int maxProfit = 0;
    //     for(int i = 0; i < prices.length; i++){
    //         for(int j = i + 1; j < prices.length; j++){
    //               int profit = prices[j] - prices[i];
    //               maxProfit = Math.max(maxProfit, profit);
    //         }
    //     }
    //     return maxProfit;
    // }
    
    //optimal appraoach
    public static int getMaxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {2,5,8,6,1,4};
        System.out.println(getMaxProfit(prices));
    }
}
