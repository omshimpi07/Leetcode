"""
509. Fibonacci Number
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) =    1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
Example 1: Input: n = 2 Output: 1 Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Difficulty : easy

Approach : Dynamic Programming
1. Recursion
2. Tabulation Dp
3. Space Optimization
Time Complexity : O(n)
Space Complexity : O(1)
    
"""

class Solution:
    def fib(self, n: int) -> int:
        #Recursion Time  : O(2^n) Space : O(n)
        # if n == 0:
        #     return 0

        # if n == 1:
        #     return 1

        # return self.fib(n - 1) + self.fib(n - 2)

        """Tabulation Dp Time  : O(n) Space : O(n)
        # if n <= 1:
        #     return n

        # dp = [0] * (n + 1)

        # dp[0] = 0
        # dp[1] = 1

        # for i in range(2, n + 1):
        #     dp[i] = dp[i - 1] + dp[i - 2]

        # return dp[n] """

        if n <= 1:
            return n

        prev2 = 0
        prev1 = 1

        for i in range(2, n + 1):

            curr = prev1 + prev2

            prev2 = prev1
            prev1 = curr

        return prev1
