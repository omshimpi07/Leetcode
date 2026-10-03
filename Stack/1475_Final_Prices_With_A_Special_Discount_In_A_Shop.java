/*
1475. Final Prices With a Special Discount in a Shop

You are given an integer array prices where prices[i] is the price of the ith item in a shop.
There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.
Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.

Example 1: Input: prices = [8,4,6,2,3] Output: [4,2,4,2,3]
Explanation: 
For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
For items 3 and 4 you will not receive any discount at all.

Difficulty : easy

Approach : Array.
1. Iterate through the prices array using a nested loop.
2. For each price at index i, check the subsequent prices at index j (where j > i) to find the first price that is less than or equal to prices[i].
3. If such a price is found, subtract it from prices[i] to get the final price for that item.
4. If no such price is found, the final price remains the same as prices[i].
Time Complexity: O(n^2) where n is the number of elements in the prices array, since we are using a nested loop to check each pair of prices.
Space Complexity: O(1) since we are modifying the prices array in place and not using any additional data structures.

*/

class Solution {
    public int[] finalPrices(int[] prices) {
        
        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                if (prices[j] <= prices[i]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return prices;
    }


}
