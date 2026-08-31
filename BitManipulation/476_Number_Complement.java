/*
476.Number Complement
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.

Example 1: Input: num = 5 Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Difficulty : Easy

Approach : Bit Manipulation.
1. Initialize a mask variable to 1.
2. Use a while loop to left shift the mask until it is greater than num. This will create a mask that has all bits set to 1 for the length of num's binary representation.
3. Subtract 1 from the mask to create a mask that has all bits set to 1 for the length of num's binary representation.
4. Use the XOR operation between the mask and num to flip all bits of num.

Time Complexity: O(log(num)) where log(num) is the number of bits in the binary representation of num, since we are left shifting the mask until it exceeds num.
Space Complexity: O(1) since we are using a constant amount of space for the mask variable.

*/

class Solution {
    public int findComplement(int num) {
        long mask = 1;

        while (mask <= num) {
            mask <<= 1;
        }

        return (int)((mask - 1) ^ num);
    }
}