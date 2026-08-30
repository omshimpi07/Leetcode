"""
191.Number of 1 Bits
Given an unsigned integer, return the number of '1' bits it has (also known as the Hamming weight).

Example 1: Input: n = 00000000000000000000000000001010 Output: 3
Explanation: The input binary string 00000000000000000000000000001010 has a total of three '1' bits.

Difficulty : easy 

    
"""

class Solution:
    def hammingWeight(self, n: int) -> int:
        count = 0

        while n != 0:
            n = n & (n - 1)
            count += 1

        return count