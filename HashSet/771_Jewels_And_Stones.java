/*
771. Jewels and Stones
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
The letters in jewels are guaranteed distinct, and all characters in jewels and stones are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1: Input: jewels = "aA", stones = "aAAbbbb" Output: 3
Example 2: Input: jewels = "z", stones = "ZZ" Output: 0

Difiiculty : easy
Approach : HashSet.
1. Create a HashSet to store the characters of the jewels string for O(1)lookups.
2. Iterate through the stones string and check if each character is in the HashSet. If it is, increment a counter.
3. Return the counter as the result.

Time Complexity: O(n + m) where n is the length of the jewels string and m is the length of the stones string.
Space Complexity: O(n) where n is the number of unique characters in the jewels string.
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<Character> set = new HashSet<>();
      
        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (set.contains(ch)) {
                count++;
            }
        }
        return count;
    }
}