/*
509. Fibonacci Number
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) =    1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
Example 1: Input: n = 2 Output: 1 Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Difficulty : easy

Approach : Dynamic Programming. 
1. We can use a bottom-up dynamic programming approach to calculate the Fibonacci number. We will maintain two variables to store the last two Fibonacci numbers and iteratively compute the next Fibonacci number until we reach n.
2. Initialize two variables, prev2 and prev1, to store F(0) and F(1) respectively.
3. Iterate from 2 to n, and for each iteration, calculate the current Fibonacci number as the sum of prev1 and prev2. Update prev2 to be prev1 and prev1 to be the current Fibonacci number.
4. After the loop, prev1 will contain F(n), which we return as the result.

Time Complexity: O(n) since we are iterating from 2 to n.
Space Complexity: O(1) since we are using a constant amount of space for the two variables.

*/

class Solution {
    public int fib(int n) {

        //reccusion : time O(**2) space O(n)
        // if(n == 0){
        //     return 0;

        // }
        // if(n == 1){
        //     return 1;
        // }

        // int ans = fib(n - 1) + fib(n - 2);
        // return ans;

        //basic approach ; time O(n) space O(1)
        //Tabulation + Space optimization
        if (n <= 1) return n;

        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {

            int curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;

        //Tabulation DP ; time - space O(n) Bottom Up
        //  if (n <= 1) return n;

        // int[] dp = new int[n + 1];

        // dp[0] = 0;
        // dp[1] = 1;

        // for (int i = 2; i <= n; i++) {
        //     dp[i] = dp[i - 1] + dp[i - 2];
        // }

        // return dp[n];



    }
}