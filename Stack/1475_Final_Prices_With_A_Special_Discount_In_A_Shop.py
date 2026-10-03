"""
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

Deffiulty: Easy

Approach: Brute Force, Stack
1. Brute Force: For each item, check the next items to find the first one that is less than or equal to the current item's price. If found, apply the discount; otherwise, keep the original price.
2. Stack: Iterate through the prices in reverse order, using a stack to keep track of
    the prices. For each price, pop from the stack until you find a price that is less than or equal to the current price. If found, apply the discount; otherwise, keep the original price. Push the current price onto the stack for future comparisons.

3. Return the modified prices array after processing all items.
Time Complexity: O(n) for the stack approach, where n is the number of items in the prices array. The brute force approach has a time complexity of O(n^2).
Space Complexity: O(n) for the stack approach, where n is the number of items in the prices array. The brute force approach has a space complexity of O(1).

"""

class Solution:
    def finalPrices(self, prices: list[int]) -> list[int]:
        # for i in range(len(prices)):

        #     for j in range(i + 1, len(prices)):

        #         if prices[j] <= prices[i]:
        #             prices[i] = prices[i] - prices[j]
        #             break

        # return prices

        stack = []

        for i in range(len(prices) - 1, -1, -1):

            original_price = prices[i]

            while stack and stack[-1] > original_price:
                stack.pop()

            if stack:
                prices[i] = original_price - stack[-1]

            stack.append(original_price)

        return prices