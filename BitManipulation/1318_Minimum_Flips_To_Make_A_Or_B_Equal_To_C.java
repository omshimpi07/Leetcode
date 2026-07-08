/*
1318. Minimum Flips to Make a OR b Equal to c
Given 3 positive numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
Flip operation consists of change any single bit 1 to 0 or change the bit 0
to 1 in their binary representation.

Example 1:
Input: a = 2, b = 6, c = 5
Output: 3
Explanation: After flips a = 1 , b = 4 , c = 5 such that (a OR b == c) i.e ( 01 OR 100 == 101).
Example 2:
Input: a = 4, b = 2, c = 7
Output: 1

Difficulty : medium

Approach : Bit Manipulation.
1. Initialize a variable flips to 0, which will count the number of flips needed.
2. While any of a, b, or c is not zero:
   a. Extract the least significant bit of a, b, and c using bitwise AND with 1.
   b. If the bit of c is 0, add the bits of a and b to flips (since both need to be flipped to 0).
   c. If the bit of c is 1 and both bits of a and b are 0, increment flips by 1 (since at least one needs to be flipped to 1).
   d. Right shift a, b, and c by 1 to process the next bit.
3. Return the total number of flips after processing all bits.

Time Complexity: O(1) since we are processing a fixed number of bits (32 bits for integers).
Space Complexity: O(1) since we are using a constant amount of space.


*/

class Solution {
    public int minFlips(int a, int b, int c) {

        int flips = 0;

        while (a != 0 || b != 0 || c != 0) {

            int bitA = a & 1;
            int bitB = b & 1;
            int bitC = c & 1;

            if (bitC == 0) {
                flips += bitA + bitB;
            } else if (bitA == 0 && bitB == 0) {
                flips++;
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return flips;
    }
}