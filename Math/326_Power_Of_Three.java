/*
326.Power of Three
Given an integer n, return true if it is a power of three. Otherwise, return false.

Example 1: Input: n = 27 Output: true Explanation: 27 = 3^3

Difficulty : easy

Approach : Math.
1. A number n is a power of three if there exists an integer x such that 3^x = n.
2. We can check this by repeatedly dividing n by 3 as long as n is greater than 1 and divisible by 3. If we end up with 1, then n is a power of three.
3. Alternatively, we can use the property that the maximum power of three that fits in a
4. 32-bit signed integer is 3^19 = 1162261467. Therefore, n is a power of three if and only if n > 0 and 1162261467 % n == 0.
Time Complexity: O(log n) for the iterative division method, or O(1) for the modulus check.
Space Complexity: O(1) since we are using a constant amount of space for the calculations.

*/

class Solution {
    public boolean isPowerOfThree(int n) {
        // if (n <= 0) {
        //     return false;
        // }

        // while (n % 3 == 0) {
        //     n = n / 3;
        // }

        // return n == 1;

        return n > 0 && 1162261467 % n == 0;
    }
}