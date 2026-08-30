/*
191.Number of 1 Bits
Given an unsigned integer, return the number of '1' bits it has (also known as the Hamming weight).

Example 1: Input: n = 00000000000000000000000000001010 Output: 3
Explanation: The input binary string 00000000000000000000000000001010 has a total of three '1' bits.

Difficulty : easy   

Approach : Bit Manipulation.
1. Initialize a count variable to 0.
2. While n is not zero, perform the following:
   a. Use the expression n & (n - 1) to turn off the rightmost '1' bit in n.
   b. Increment the count variable.
3. Return the count variable as the result.

Time Complexity: O(k) where k is the number of '1' bits in the integer, since each iteration of the loop removes one '1' bit.
Space Complexity: O(1) since we are using a constant amount of space for the count variable.

*/

class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}