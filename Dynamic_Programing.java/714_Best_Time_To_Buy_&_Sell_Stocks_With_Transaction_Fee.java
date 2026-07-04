/*
714. Best Time to Buy & Sell Stocks With Transaction Fee
You are given an array prices where prices[i] is the price of a given stock on the
Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction. Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).  

Example 1: Input: prices = [1,3,2,8,4,9], fee = 2 Output: 8 Explanation: The maximum profit can be achieved by:

Example 2: Input: prices = [1,3,7,5,10,3], fee = 3 Output: 6 Explanation: The maximum profit can be achieved by:

Difficulty : medium

Approach : Dynamic Programming.
1. Use a 2D array dp where dp[i][0] represents the maximum profit on day i when we can buy, and dp[i][1] represents the maximum profit on day i when we can sell.
2. Initialize dp[0][0] = 0 (no profit on day 0 when we can buy) and dp[0][1] = -prices[0] (we buy the stock on day 0).
3. Iterate through the prices array from day 1 to the last day, updating dp[i][0] and dp[i][1] based on the previous day's values and the current price.
4. The final answer will be the maximum profit on the last day when we can sell, which is dp[n-1][0].

Time Complexity: O(n) where n is the number of days (length of prices array).
Space Complexity: O(n) for the dp array, but can be optimized to O(1) by using two variables to store the previous day's values.

*/

class Solution {

    Integer[][] dp;

    public int maxProfit(int[] prices, int fee) {

        dp = new Integer[prices.length][2];

        return solve(0, 1, prices, fee);
    }

    private int solve(int day, int canBuy, int[] prices, int fee) {

        if (day == prices.length){
            return 0;
        }
        if (dp[day][canBuy] != null){
            return dp[day][canBuy];
        }
        if (canBuy == 1) {

            int buy = -prices[day]+ solve(day + 1, 0, prices, fee);

            int skip = solve(day + 1, 1, prices, fee);

            dp[day][canBuy] = Math.max(buy, skip);
        }

        else {

            int sell = prices[day] - fee + solve(day + 1, 1, prices, fee);

            int hold = solve(day + 1, 0, prices, fee);

            dp[day][canBuy] = Math.max(sell, hold);
        }
        
        return dp[day][canBuy];
    }
}