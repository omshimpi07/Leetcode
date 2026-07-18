/*
205. Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1: Input: s = "egg", t = "add" Output: true
Example 2: Input: s = "foo", t = "bar" Output: false

Difficulty : easy

Approach : HashMap.
1. Create two HashMaps to store the character mappings from s to t and from t to s.
2. Iterate through the characters of both strings simultaneously.
3. For each character pair (c1, c2) from s and t:
   a. If c1 is already in the first map, check if it maps to c2. If not, return false.
   b. If c1 is not in the first map, add the mapping c1 -> c2.
   c. Repeat the same process for the second map with c2 and c1.
4. If all character pairs are processed without conflicts, return true.

Time Complexity: O(n) where n is the length of the strings, since we are iterating through the strings once.
Space Complexity: O(n) for the two HashMaps storing the character mappings.

 */

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1.containsKey(c1)) {

                if (map1.get(c1) != c2)
                    return false;

            } else {

                map1.put(c1, c2);
            }

            if (map2.containsKey(c2)) {

                if (map2.get(c2) != c1)
                    return false;

            } else {

                map2.put(c2, c1);
            }
        }

        return true;
    }
}