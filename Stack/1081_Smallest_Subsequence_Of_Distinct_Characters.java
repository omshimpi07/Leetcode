/*
1081. Smallest Subsequence of Distinct Characters

Given a string s, return the lexicographically smallest subsequence of s that contains all the distinct characters of s exactly once.

Example 1: Input: s = "bcabc" Output: "abc"
Example 2: Input: s = "cbacdcbc" Output: "acdb"
 
Note: This question is the same as 316: https://leetcode.com/problems/remove-duplicate-letters/

Difficulty : medium

Approach : Stack.
1. Create an array freq of size 26 to store the frequency of each character in the string s.
2. Create a boolean array used of size 26 to keep track of whether a character has been added to the stack or not.
3. Create a stack to build the result subsequence.
4. Iterate through each character c in the string s:
   a. Decrease the frequency of c in freq.
   b. If c has already been used (used[c - 'a'] is true), continue to the next character.
   c. While the stack is not empty, and the top character of the stack is greater than c, and the frequency of the top character is greater than 0 (meaning it will appear later), pop the top character from the stack and mark it as unused in used.
   d. Push c onto the stack and mark it as used in used.
5. After processing all characters, the stack will contain the lexicographically smallest subsequence of distinct characters. Convert the stack to a string and return it.

Time Complexity: O(n) where n is the length of the string s, since each character is processed at most twice (once when added to the stack and once when removed).    
Space Complexity: O(n) for the stack and the frequency and used arrays, which are of constant size 26.

*/

class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[26];
        boolean[] used = new boolean[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            freq[c - 'a']--;

            if (used[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty()
                    && stack.peek() > c
                    && freq[stack.peek() - 'a'] > 0) {

                used[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            used[c - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stack) {
            ans.append(c);
        }

        return ans.toString();
    }
}