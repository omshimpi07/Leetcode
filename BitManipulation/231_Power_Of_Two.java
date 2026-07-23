/*
231. Power of Two

Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:Input: n = 1 Output: true
Explanation: 20 = 1
Example 2: Input: n = 16 Output: true
Explanation: 24 = 16
Example 3:Input: n = 3Output: false

Difficulty : easy

Approach : Bit Manipulation.
1. A number is a power of two if it has exactly one bit set in its binary representation. This means that for a number n, the expression (n & (n - 1)) will be zero if n is a power of two.
2. Additionally, we need to ensure that n is greater than zero, as negative numbers and zero are not powers of two.

Time Complexity: O(1) since we are performing a constant number of operations.
Space Complexity: O(1) since we are using a constant amount of space for the variables.

*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        
    // if (n == 1) return true;
    // if (n <= 0 || n % 2 != 0) return false;

    // return isPowerOfTwo(n / 2);

    //  if (n <= 0)
    //         return false;

    //     double x = Math.log(n) / Math.log(2);

    //     return Math.abs(x - Math.round(x)) < 1e-10;
    // }

    return n > 0 && (n & (n - 1)) == 0;

    }
}