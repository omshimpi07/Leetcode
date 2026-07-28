/*
709. To Lower Case

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1: Input: s = "Hello" Output: "hello"
Example 2: Input: s = "here" Output: "here"
Example 3:Input: s = "LOVELY" Output: "lovely"
 
Difficulty : easy

Approach : String.
1. Convert the input string to a character array.
2. Iterate through the character array and for each character, check if it is an uppercase letter (between 'A' and 'Z').
3. If it is an uppercase letter, convert it to lowercase by adding 32 to its ASCII value.
4. After processing all characters, convert the character array back to a string and return it.

Time Complexity: O(n) where n is the length of the input string, since we are iterating through each character of the string.
Space Complexity: O(n) for the character array used to store the modified characters.

*/
class Solution {
    public String toLowerCase(String s) {
        // return s.toLowerCase();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char)(ch[i] + 32);
            }
        }

        return new String(ch);
    }
}