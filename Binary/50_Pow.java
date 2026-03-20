/*
50. Pow(x, n)
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1: Input: x = 2.00000, n = 10 Output: 1024.00000
Example 2: Input: x = 2.10000, n = 3  Output: 9.26100
Example 3: Input: x = 2.00000, n = -2 Output: 0.25000 Explanation: 2^-2 = 1/2^2 = 1/4 = 0.25

Difficulty: Medium

Approach:
1. Handle negative exponent by taking the reciprocal of x and negating n.
2. Use exponentiation by squaring to calculate x^n efficiently. This method reduces the number of multiplications needed, resulting in a time complexity of O(log n).
Time Complexity: O(log n)
Space Complexity: O(1)

*/
class Solution {
    public double myPow(double x, int n) {
        
        long BinForm =(long) n ;
        double ans = 1;

        if(n < 0){
            x = 1/x;
            BinForm = -BinForm;
        }
        while( BinForm > 0){

            if(BinForm % 2 == 1){
                ans *= x;
            }
            x *= x;
            BinForm /= 2;
        }
        return ans;
    }
}