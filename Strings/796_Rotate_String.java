/*
796. Rotate String
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
Example 1: Input: s = "abcde", goal = "cdeab" Output: true
Example 2: Input: s = "abcde", goal = "abced" Output: false

Difficulty : easy

Approach : String Concatenation.
1. Check if the lengths of s and goal are equal. If not, return false.
2. Concatenate s with itself (s + s). This will create a string that contains all possible rotations of s as substrings.
3. Check if goal is a substring of the concatenated string. If it is, return true; otherwise, return false.

Time Complexity: O(n) where n is the length of the strings s and goal.
Space Complexity: O(n) for the concatenated string.
*/

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}