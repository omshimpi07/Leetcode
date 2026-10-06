/*
394. Decode String
Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
Example 1: Input: s = "3[a]2[bc]" Output: "aaabcbc"
Example 2: Input: s = "3[a2[c]]" Output: "accaccacc"
Example 3: Input: s = "2[abc]3[cd]ef" Output: "abcabccdcdcdef"
Difficulty : medium
Approach : Stack.
1. Create two stacks, one for numbers and one for strings.
2. Iterate through the characters of the input string. For each character:
   a. If it is a digit, calculate the number and push it onto the number stack.
   b. If it is an opening bracket '[', push the current string onto the string stack and reset the current string.
   c. If it is a closing bracket ']', pop a number from the number stack and a string from the string stack. Repeat the current string that many times and append it to the popped string, then set this as the new current string.
   d. If it is a letter, append it to the current string.
3. After processing all characters, the current string will contain the fully decoded string. Return it.
Time Complexity: O(n) where n is the length of the input string.
Space Complexity: O(n) for the stacks and the output string.

*/

class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();

        StringBuilder curr = new StringBuilder();

        int num = 0;

        for (char ch : s.toCharArray()) {

            // digit
            if (Character.isDigit(ch)) {

                num = num * 10 + (ch - '0');
            }

            // opening bracket
            else if (ch == '[') {

                numStack.push(num);
                strStack.push(curr);

                curr = new StringBuilder();
                num = 0;
            }

            // closing bracket
            else if (ch == ']') {

                int times = numStack.pop();

                StringBuilder prev = strStack.pop();

                for (int i = 0; i < times; i++) {
                    prev.append(curr);
                }

                curr = prev;
            }

            // letter
            else {

                curr.append(ch);
            }
        }

        return curr.toString();
    }

}
