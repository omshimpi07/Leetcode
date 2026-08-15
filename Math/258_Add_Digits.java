/*
258. Add Digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1: Input: num = 38 Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2: Input: num = 0 Output: 0
 
Difficulty : easy
Approach : Math.
1. The problem can be solved using a mathematical property known as digital root. The digital root of a non-negative integer is the single-digit value obtained by an iterative process of summing digits, on each iteration using the result from the previous iteration to compute a digit sum. The process continues until a single-digit number is reached.
2. The digital root can be computed using the formula:
   - If num == 0, return 0.
   - Otherwise, return (num - 1) % 9 + 1.
3. This formula works because the digital root of a number is congruent to the number modulo 9, with a special case for numbers that are multiples of 9.
Time Complexity: O(1) since we are using a constant time mathematical formula.
Space Complexity: O(1) since we are using a constant amount of space for the calculations.

*/
class Solution {
    public int addDigits(int num) {

        // while (num >= 10) {

        //     int sum = 0;

        //     while (num > 0) {
        //         sum += num % 10;
        //         num /= 10;
        //     }

        //     num = sum;
        // }

        // return num;

        if (num == 0) {
            return 0;
        }

        return (num - 1) % 9 + 1;
    }
}