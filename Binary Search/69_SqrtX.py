"""
    69. Sqrt(x)

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1: Input: x = 4 Output: 2
Explanation: The square root of 4 is 2, so we return 2.

"""

class Solution:
    def mySqrt(self, x: int) -> int:

        if x < 2:
            return x

        left = 1
        right = x // 2
        ans = 0

        while left <= right:

            mid = left + (right - left) // 2

            if mid * mid <= x:
                ans = mid
                left = mid + 1
            else:
                right = mid - 1

        return ans