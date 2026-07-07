/*
190. Reverse Bits
Reverse bits of a given 32 bits unsigned integer.

Example 1:
Input: n = 00000010100101000001111010011100
Output:    964176192 (00111001011110000010100101000000)

Example 2:
Input: n = 11111111111111111111111111111101
Output:   322122547

Difficulty : easy
Approach : Bit Manipulation.
1. Initialize a variable ans to 0, which will hold the reversed bits.
2. Iterate through each of the 32 bits of the input integer n:
    a. Left shift ans by 1 to make space for the next bit.
    b. Use bitwise AND operation (n & 1) to get the least significant bit of n and add it to ans using bitwise OR operation.
    c. Unsigned right shift n by 1 to process the next bit in the next iteration.
3. After processing all 32 bits, return ans which contains the reversed bits of n.

Time Complexity: O(1) since we are always processing 32 bits.
Space Complexity: O(1) since we are using a constant amount of space.

*/

class Solution {
    public int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {

            ans <<= 1;          // Make space for next bit

            ans |= (n & 1);     // Copy last bit of n

            n >>>= 1;           // Unsigned right shift
        }

        return ans;
    }
}