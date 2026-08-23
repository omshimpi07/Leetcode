/*
2235.Add Two Integers
Given two integers num1 and num2, return the sum of the two integers.

Example 1: Input: num1 = 12, num2 = 5 Output: 17
Difficulty : easy

Approach : Bit Manipulation.
1. Use bitwise operations to add two integers without using the '+' operator.
2. The idea is to use the XOR operation to add the bits of num1 and num2 without carrying, and the AND operation followed by a left shift to calculate the carry.
3. Repeat the process until there is no carry left (i.e., num2 becomes
4. The final value of num1 will be the sum of the two integers.

Time Complexity: O(log(max(num1, num2))) since we are processing each bit of the numbers.
Space Complexity: O(1) since we are using a constant amount of space for the calculations.

*/

class Solution {
    public int sum(int num1, int num2) {
        // return num1 + num2;
        while (num2 != 0) {
            int carry = (num1 & num2) << 1;
            num1 = num1 ^ num2;
            num2 = carry;
        }

        return num1;
    }
}