/*
1281. Subtract the Product and Sum of Digits of an Integer
Given an integer number n, return the difference between the product of its digits and the sum of
    its digits.

Example 1:
Input: n = 234 Output: 15
Explanation: Product of digits = 2 * 3 * 4 = 24 Sum of digits = 2 + 3 + 4 = 9 Result = 24 - 9 = 15

Difficulty : easy

Approach : Math.
1. Initialize two variables, mul and sum, to 1 and 0 respectively.
2. While n is greater than 0, extract the last digit of n using n % 10.
3. Multiply mul by the extracted digit and add the extracted digit to sum.
4. Remove the last digit from n by performing integer division by 10 (n /= 10).
5. After processing all digits, return the difference between mul and sum (mul - sum).

Time Complexity: O(log n) where n is the input number, since we process each digit of n.
Space Complexity: O(1) since we are using a constant amount of space for the calculations.

*/
class Solution {
    public int subtractProductAndSum(int n) {

        int mul = 1;
        int sum = 0;
        while(n > 0){
            int percent = n % 10;

            mul *= percent;
            sum += percent;
            n /= 10;
        }
        return mul - sum;
        
        
        
    }
}