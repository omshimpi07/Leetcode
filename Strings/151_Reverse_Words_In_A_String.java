/*

151. Reverse Words in a String
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.

Example 1: Input: s = "the sky is blue" Output: "blue is sky the"
Example 2: Input: s = "  hello world  " Output: "world hello"

Constraints:
1 <= s.length <= 104
s consists of English letters (upper-case and lower-case), digits, and spaces ' '.
s contains at least one word.
Difficulty: Medium
Approach:
1. Trim the input string to remove leading and trailing spaces, and replace multiple spaces with a single space.
2. Split the string into words using space as a delimiter.
3. Reverse the order of the words and concatenate them with a single space in between.

Time Complexity: O(n) where n is the length of the input string.
Space Complexity: O(n) for storing the split words and the result string.
*/

class Solution {
    public String reverseWords(String s) {
        
        String S = s.trim().replaceAll("\\s+", " ");
        String[] parts = S.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = parts.length-1; i>= 0;i--){

            result.append(parts[i]);
            if(i != 0){
                result.append(" ");
            }
        }
        return result.toString();
    }
    
}
