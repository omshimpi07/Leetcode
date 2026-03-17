/*  

242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
Difficulty: Easy
Approach:
1. Check if the lengths of the two strings are equal. If not, return false.
2. Create an array of size 26 to count the frequency of each character in the strings
3. Iterate through both strings simultaneously, incrementing the count for characters in string s and decrementing for characters in string t.
4. After the iteration, check if all counts are zero. If they are, return true; otherwise, return false.
Time Complexity: O(n)
Space Complexity: O(1) since the count array size is fixed at 26.

*/

class Solution {
   public boolean isAnagram(String s, String t) {
       int n1 = s.length();
       int n2 = t.length();
       if (n1 != n2) return false;


       int[] count = new int[26];
       for (int i = 0; i < n1; i++) {
           count[s.charAt(i) - 'a']++;
           count[t.charAt(i) - 'a']--;
       }


       for (int i = 0; i < 26; i++) {
           if (count[i] != 0) return false;
       }
       return true;
   }
}