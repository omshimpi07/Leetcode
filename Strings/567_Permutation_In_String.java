/*
567. Permutation in String
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.

Example 1: Input: s1 = "ab", s2 = "eidbaooo" Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2: Input: s1 = "ab", s2 = "eidboaoo" Output: false

Constraints:
1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
Difficulty : medium
*/
class Solution {
   public boolean checkInclusion(String s1, String s2) {
       int n1 = s1.length();
       int n2 = s2.length();
       if (n1 > n2) return false;

       int[] count1 = new int[26];
       int[] count2 = new int[26];

       for (int i = 0; i < n1; i++) {
           count1[s1.charAt(i) - 'a']++;
           count2[s2.charAt(i) - 'a']++;
       }

       if (Arrays.equals(count1, count2)) return true;

       int j = 0;
       for (int i = n1; i < n2; i++)
       {
           count2[s2.charAt(i) - 'a']++;
           count2[s2.charAt(j) - 'a']--;
           
           if (Arrays.equals(count1, count2))
           return true;
           j++;
       }
       return false;
   }
}
