/*
66. Plus One
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Implement a function that increments the large integer by one and returns the resulting array of digits.

Example 1: Input: digits = [1,2,3] Output: [1,2,4] Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1,2,4].
Example 2: Input: digits = [4,3,2,1] Output:[4,3,2,2] Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus, the result should be [4,3,2,2].

Difficulty : easy

Approach : Array.
1. Traverse the digits array from the last digit to the first.
2. For each digit, check if it is less than 9:  
    a. If it is, simply increment the digit by 1 and return the array.  
    b. If it is 9, set the digit to 0 and continue to the next digit (carry over).  
3. If all digits are 9 (e.g., 999), after the loop, create a new array with a length of digits.length + 1, set the first element to 1, and return this new array (e.g., 1000).

Time Complexity: O(n) where n is the number of digits, since we may need to traverse the entire array in the worst case.
Space Complexity: O(n) in the worst case when all digits are 9, requiring a new array of size n + 1. Otherwise, the space complexity is O(1) for in-place modification.

*/


class Solution {
    public int[] plusOne(int[] digits) {

        // Traverse from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and carry continues
            digits[i] = 0;
        }

        // If all digits were 9 (e.g., 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}