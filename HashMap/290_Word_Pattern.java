/*
290. Word Pattern
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1: Input: pattern = "abba", s = "dog cat cat dog" Output: true

Constraints: 1 <= pattern.length <= 300
pattern contains only lower-case English letters. 1 <= s.length <= 3000
s contains only lower-case English letters and spaces ' '.
s does not contain any leading or trailing spaces. s does not contain multiple spaces between two words.

Difficulty : easy

Approach:
1. Use two HashMaps to maintain the mapping between characters in the pattern and words in the string.
2. Split the string s into words and check if the length of the pattern matches the number of words.
3. Iterate through the pattern and words simultaneously, checking the mappings in both HashMaps.
4. If a mapping is inconsistent, return false. If all mappings are consistent, return true.

Time Complexity: O(n) where n is the length of the pattern and the number of words in s.
Space Complexity: O(n) for the HashMaps storing the mappings between characters and words.
*/


class Solution {
    public boolean wordPattern(String pattern, String s) {
        

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map1 = new HashMap<>();

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            }

            if (map1.containsKey(word)) {
                if (map1.get(word) != ch) {
                    return false;
                }
            }

            map1.put(word, ch);
            map.put(ch , word);
        }

        return true;
    }
}