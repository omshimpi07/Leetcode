/*
67. Add Binary

Given two binary strings a and b, return their sum as a binary string.

Example 1: Input: a = "11", b = "1" Output: "100"
Example 2: Input: a = "1010", b = "1011" Output: "10101"

Approach : String.
1. Initialize two pointers i and j to the end of strings a and b respectively, and
2. Initialize a carry variable to 0 and an empty StringBuilder to store the result.
3. Iterate while either pointer is valid or there is a carry:
   a. Calculate the sum of the current digits and the carry.
   b. Append the least significant bit of the sum to the result and update the carry.
4. Reverse the result and return it as a string.

Time Complexity: O(max(m, n)) where m and n are the lengths of strings a and b respectively.
Space Complexity: O(max(m, n)) for the result string.

*/

class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}