/*
121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the
ith day.
You want to maximize your profit by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot
achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
Constraints:
1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4
Difficulty: Easy
Approach:
1. Initialize two variables: `lowest_buy` to track the lowest price seen so far and `max_profit` to track the maximum profit.
2. Iterate through the `prices` array:
   - If the current price is less than `lowest_buy`, update `lowest_buy` to the current price.
   - Otherwise, calculate the profit by subtracting `lowest_buy` from the current price and update `max_profit` if this profit is greater than the current `max_profit`.
3. Return `max_profit` after iterating through all prices.
Time Complexity: O(n)
Space Complexity: O(1)
    

*/


class Solution {
    public int maxProfit(int[] prices) {
        
        int lowest_buy = Integer.MAX_VALUE;
        
        int max_profit = 0;
        
        for(int i = 0 ;i <prices.length;i++){
        
                if(lowest_buy < prices[i]){

                    int profit = prices[i] - lowest_buy;
                    max_profit = Math.max(max_profit,profit);

                }else{
                    lowest_buy = prices[i];
                }
                
        }
        return max_profit;
    }

}