"""
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
1. Initialize an empty list `result` to store the characters of the final string.
2. Initialize a variable `balance` to 0 to keep track of the balance of parentheses.
3. Iterate through each character `c` in the input string `s`.
    - If `c` is '(', check if `balance` is greater than 0. If it is, append `c` to `result`. Then increment `balance` by 1.
    - If `c` is ')', decrement `balance` by 1. If `balance` is greater than 0 after decrementing, append `c` to `result`.
4. After iterating through all characters, join the `result` list into a string and return it.

Time complexity of this approach is O(n), where n is the length of the input string `s`, since we are iterating through the string once. The space complexity is also O(n) in the worst case, as we may need to store all characters in the `result` list.4
Space complexity is O(n) in the worst case, as we may need to store all characters in the `result` list.

"""


class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        result = []

        balance = 0

        for c in s:

            if c == '(':

                if balance > 0:
                    result.append(c)

                balance += 1

            else:

                balance -= 1

                if balance > 0:
                    result.append(c)

        return "".join(result)
