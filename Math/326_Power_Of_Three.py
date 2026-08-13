"""
326.Power of Three
Given an integer n, return true if it is a power of three. Otherwise, return false.

Example 1: Input: n = 27 Output: true Explanation: 27 = 3^3

Difficulty : easy
    
"""

class Solution:
    def isPowerOfThree(self, n: int) -> bool:

        # if n <= 0:
        #     return False

        # while n % 3 == 0:
        #     n //= 3

        # return n == 1
        # return n > 0 and 1162261467 % n == 0
        return n > 0 and 3**19 % n == 0