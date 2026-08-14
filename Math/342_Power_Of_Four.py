"""
342. Power of Four
Given an integer n, return true if it is a power of four. Otherwise, return false

Difficulty : easy

Approach:
1. Check if n is less than or equal to 0. If it is, return False.
2. Use a while loop to divide n by 4 as long as n is divisible by 4.
3. After the loop, check if n is equal to 1. If it is, return True; otherwise, return False.4

Time Complexity: O(log n) - The while loop runs until n becomes 1, and in each iteration, n is divided by 4.
Space Complexity: O(1) - The algorithm uses a constant amount of space regardless of the input size.

"""
class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n <= 0:
            return False

        while n % 4 == 0:
            n //= 4

        return n == 1