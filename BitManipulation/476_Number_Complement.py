"""

476.Number Complement
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.

Example 1: Input: num = 5 Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Difficulty : Easy

Approach :
1. Find the bit length of the given number.
2. Create a mask with all bits set to 1 of the same length.
3. XOR the number with the mask to get the complement.

Time Complexity : O(1)
Space Complexity : O(1)

"""

class Solution:
    def findComplement(self, num: int) -> int:
        # mask = 1

        # while mask <= num:
        #     mask <<= 1

        # return (mask - 1) ^ num

        mask = (1 << num.bit_length()) - 1
        return mask ^ num