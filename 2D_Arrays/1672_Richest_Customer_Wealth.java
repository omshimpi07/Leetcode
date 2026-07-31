/*
1672. Richest Customer Wealth
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1: Input: accounts = [[1,2,3],[3,2,1]] Output: 6 Explanation: 1st customer has wealth = 1 + 2 + 3 = 6 2nd customer has wealth = 3 + 2 + 1 = 6 Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2: Input: accounts = [[1,5],[7,3],[3,5]] Output: 10 Explanation: 1st customer has wealth = 6 2nd customer has wealth = 10 3rd customer has wealth = 8 The richest customer is the 2nd with a wealth of 10.

Difficulty : easy

Approach : Array.
1. Initialize a variable max to 0 to keep track of the maximum wealth found so far.
2. Iterate through each customer (row) in the accounts array.
3. For each customer, calculate their total wealth by summing up the amounts in all their bank accounts (columns).
4. Update the max variable if the current customer's wealth is greater than the current max.
5. After checking all customers, return the max variable which contains the wealth of the richest customer

Time Complexity: O(m * n) where m is the number of customers and n is the number of bank accounts, since we are iterating through each element in the accounts array.
Space Complexity: O(1) since we are using a constant amount of extra space regardless of the input size.
 */
class Solution {

    public int maximumWealth(int[][] accounts) {

        int max = 0;

        for(int i = 0; i < accounts.length; i++){

            int sum = 0;

            for(int j = 0; j < accounts[i].length; j++){

                sum += accounts[i][j];

            }

            max = Math.max(max, sum);
        }

        return max;
    }
}