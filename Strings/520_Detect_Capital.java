/*
520. Detect Capital
Given a word, you need to judge whether the usage of capitals in it is right or not.
We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.

Example 1: Input: word = "USA" Output: true
Example 2: Input: word = "FlaG" Output: false

Constraints: 1 <= word.length <= 100

Difficulty: Easy
Approach:
1. Check if the word is equal to its uppercase version. If it is, return true
2. Check if the word is equal to its lowercase version. If it is, return true
3. Check if the first character is uppercase and the rest of the characters are lowercase. If it is, return true
*/

class Solution {
    public boolean detectCapitalUse(String word) {
        
        if (word.equals(word.toUpperCase())) return true;

        if (word.equals(word.toLowerCase())) return true;

        if (Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }
}