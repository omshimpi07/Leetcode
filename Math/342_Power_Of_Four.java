/*
342. Power of Four
Given an integer n, return true if it is a power of four. Otherwise, return false

Difficulty : easy

Approach : Math.
1. A number n is a power of four if there exists an integer x such that 4^x = n.
2. We can check this by repeatedly dividing n by 4 as long as n is greater than 1 and divisible by 4. If we end up with 1, then n is a power of four.
3. Alternatively, we can use the property that the maximum power of four that fits in a
4. 32-bit signed integer is 4^15 = 1073741824. Therefore, n is a power of four if and only if n > 0 and 1073741824 % n == 0.

Time Complexity: O(log n) for the iterative division method, or O(1) for the modulus check.
Space Complexity: O(1) since we are using a constant amount of space for the calculations.

*/

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
        
    }
}