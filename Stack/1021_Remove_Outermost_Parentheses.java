/*
1021. Remove Outermost Parentheses

A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

Example 1: Input: s = "(()())(()) Output: "()()()"
Explanation: The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
Example 2: Input: s = "(()())(())(()(()))" Output: "()()()()(())"
Explanation: The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
Example 3: Input: s = "()()" Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".
 
Difficulty: Easy

Approach: Stack
1. Initialize a StringBuilder to build the result string.
2. Initialize a balance variable to keep track of the number of open parentheses.
3. Iterate through each character in the input string s.    
4. If the character is '(', check if balance is greater than 0. If it is, append '(' to the StringBuilder. Then increment balance.
5. If the character is ')', decrement balance. Check if balance is greater than 0. If it is, append ')' to the StringBuilder.
6. After iterating through all characters, return the StringBuilder as a string.
7. This approach effectively removes the outermost parentheses of each primitive valid parentheses string.

Time Complexity: O(n), where n is the length of the input string s.
Space Complexity: O(n), as we are using a StringBuilder to store the result string.

 */

 class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder();

        int balance = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {

                if (balance > 0) {
                    sb.append(c);
                }

                balance++;

            } else {

                balance--;

                if (balance > 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();


    }
}