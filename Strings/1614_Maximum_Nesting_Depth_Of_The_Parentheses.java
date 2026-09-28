/*
1614. Maximum Nesting Depth of the Parentheses

Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1: Input: s = "(1+(2*3)+((8)/4))+1" Output: 3
Explanation: Digit 8 is inside of 3 nested parentheses in the string.

Difficulty : Easy

*/

class Solution {
    public int maxDepth(String s) {
        

        int depth = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                depth++;

                maxDepth = Math.max(maxDepth, depth);
            }
            else if (s.charAt(i) == ')') {
                depth--;
            }
        }

        return maxDepth;
        
    }
}