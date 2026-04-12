/*
387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1: Input: s = "leetcode" Output: 0
Example 2: Input: s = "loveleetcode" Output: 2
Example 3: Input: s = "aabb" Output: -1

Constraints: 1 <= s.length <= 10^5
s consists of only lowercase English letters.

Difficulty : easy

Approach:
1. Use a HashMap to count the frequency of each character in the string.
2. Iterate through the string again and check the frequency of each character in the HashMap.
3. Return the index of the first character that has a frequency of 1.
Time Complexity: O(n) where n is the length of the input string.
Space Complexity: O(1) since the HashMap will at most contain 26 entries for lowercase English letters.

*/

class Solution { 
    
    public int firstUniqChar(String s) 
    { 
    HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
        } 
        for(int i = 0; i < s.length(); i++)
        { 
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        } 
        return -1;
    } 
}