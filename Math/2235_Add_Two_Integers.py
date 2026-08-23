"""
2235.Add Two Integers
Given two integers num1 and num2, return the sum of the two integers.

Example 1: Input: num1 = 12, num2 = 5 Output: 17

Difficulty : easy

Approach : Bit Manipulation
1. Use bitwise AND to find the carry bits.
2. Use bitwise XOR to find the sum bits.
3. Shift the carry bits to the left by 1 to add them to the sum bits.
4. Repeat the process until there are no carry bits left.

Time Complexity : O(1)
Space Complexity : O(1)

"""


class Solution:
    def sum(self, num1: int, num2: int) -> int:
        # return num1 + num2
        mask = 0xFFFFFFFF
        max_int = 0x7FFFFFFF

        while num2 != 0:
            carry = ((num1 & num2) << 1) & mask
            num1 = (num1 ^ num2) & mask
            num2 = carry

        return num1 if num1 <= max_int else ~(num1 ^ mask)