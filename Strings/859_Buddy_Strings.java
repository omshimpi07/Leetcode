/*
859. Buddy Strings
Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
Example 1: Input: s = "ab", goal = "ba" Output: true
Example 2: Input: s = "ab", goal = "ab" Output: false
Example 3: Input: s = "aa", goal = "aa" Output: true
Constraints:
1 <= s.length, goal.length <= 2 * 104
s and goal consist of lowercase letters.
Difficulty : easy
Approach:
1. First, check if the lengths of s and goal are different. If they are, return false.
2. If s and goal are the same, check if there is at least one duplicate character in s. If there is, return true; otherwise, return false.
3. If s and goal are different, find the indices where they differ. If there are more than two differences, return false.
4. If there are exactly two differences, check if swapping the characters at those indices in s
    would make s equal to goal. If it does, return true; otherwise, return false.
Time Complexity: O(n) where n is the length of the strings.
Space Complexity: O(1) since we are using a fixed-size frequency array for the characters

*/

class Solution {
    public boolean buddyStrings(String s, String goal) {
        
        if(s.length() != goal.length()) return false;

        // Case 1: same string
        if(s.equals(goal)){
            int[] freq = new int[26];
            
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
                if(freq[c - 'a'] > 1){
                    return true; // duplicate exists
                }
            }
            return false;
        }
        // Case 2: find mismatches
        int first = -1, second = -1;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(first == -1) first = i;
                else if(second == -1) second = i;
                else return false;
            }
        }
        return (second != -1 &&
                s.charAt(first) == goal.charAt(second) &&
                s.charAt(second) == goal.charAt(first));
    }
}