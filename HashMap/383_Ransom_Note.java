/*
383. Ransom Note
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1: Input: ransomNote = "a", magazine = "b" Output: false
Example 2: Input: ransomNote = "aa", magazine = "ab" Output: false
Example 3: Input: ransomNote = "aa", magazine = "aab" Output: true

Constraints: 1 <= ransomNote.length, magazine.length <= 10^5 ransomNote and magazine consist of lowercase English letters.

Difficulty : easy

Approach:
1. Use two HashMaps to count the frequency of each character in ransomNote and magazine.
2. Iterate through the keys of the first HashMap and check if the frequency of each character in magazine is greater than or equal to the frequency in ransomNote.
3. If any character in ransomNote has a frequency greater than that in magazine, return false. If all characters have sufficient frequency, return true.

Time Complexity: O(n) where n is the length of the longer string between ransomNote andmagazine.
Space Complexity: O(1) since the HashMaps will at most contain 26 entries for

*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        HashMap<Character , Integer> map1 = new HashMap<>();
        int freq = 0;
        int freq1 = 0;
        for(int i = 0; i<ransomNote.length();i++){

            char ch = ransomNote.charAt(i);
            freq = map.getOrDefault(ch, 0) + 1;
            map.put(ch, freq);
        }

        for(int i = 0; i<magazine.length();i++){

            char ch1 = magazine.charAt(i);
            freq1 = map1.getOrDefault(ch1, 0) + 1;
            map1.put(ch1, freq1);

        }

        for (char key : map.keySet()) {
            if (!map1.containsKey(key)) return false;
            if (map1.get(key) < map.get(key)) return false;
        }
        return true;
    }
}