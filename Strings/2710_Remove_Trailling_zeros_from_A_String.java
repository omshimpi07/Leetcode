/*
2710. Remove Trailing Zeros From a String

Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.

Example 1: Input: num = "51230100" Output: "512301"
Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".

Difficulty : Easy
*/

class Solution {
    public String removeTrailingZeros(String num) {
        

        int i = num.length() - 1;

        // Remove trailing zeros
        while (i >= 0 && num.charAt(i) == '0') {
            i--;
        }

        return num.substring(0, i + 1);


    }
}