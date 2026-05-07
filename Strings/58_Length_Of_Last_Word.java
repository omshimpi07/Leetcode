/*
58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.   

Example 1: Input: s = "Hello World" Output: 5
Example 2: Input: s = "   fly me   to   the moon  " Output: 4       

s consists of only English letters and spaces ' '.          

Difficulty: Easy

Approach:
1. Trim the input string to remove leading and trailing spaces, and replace multiple spaces with a single space.    
2. Split the string into words using space as a delimiter.
3. Return the length of the last word in the split array.

 */

class Solution {
    public int lengthOfLastWord(String s) {
        
        String S = s.trim().replaceAll("\\s+", " ");
        String[] parts = S.split(" ");

        return parts[parts.length - 1].length();
    }
}