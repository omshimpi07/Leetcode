/*
821. Shortest Distance to a Character
Given a string s and a character c that occurs in s, return an array of integers answer
    such that answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.   

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

Example 1: Input: s = "loveleetcode", c = "e" Output: [3,2,1,0,1,0,0,1,2,2,1,0] Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed). The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3. The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2. For index 4, there are two occurrences of 'e' (at indices 3 and 5), but the closest one is at index 5, so the distance is abs(4 - 5) = 1. For index 8, the closest occurrence of 'e' is at index 6, so the distance is abs(8 - 6) = 2.
Difficulty : easy   

Approach : Two Passes.
1. Initialize an array ans of the same length as s to store the distances.
2. Perform a left-to-right pass through the string:
   a. Keep track of the last seen index of character c.
   b. For each index i, if s[i] is c, update the last seen index.
   c. Calculate the distance from i to the last seen index and store it in ans[i].  

3. Perform a right-to-left pass through the string:
   a. Keep track of the last seen index of character c.
   b. For each index i, if s[i] is c, update the last seen index.
   c. Calculate the distance from i to the last seen index and update ans[i] with the minimum of its current value and this new distance.

Time Complexity: O(n) where n is the length of the string s, since we are making two passes through the string.
Space Complexity: O(n) for the output array ans.

*/

class Solution {
    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] ans = new int[n];

        int last = -n;

        // Left -> Right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c)
                last = i;

            ans[i] = i - last;
        }

        last = 2 * n;

        // Right -> Left
        for (int i = n - 1; i >= 0; i--) {

            if (s.charAt(i) == c)
                last = i;

            ans[i] = Math.min(ans[i], last - i);
        }

        return ans;
    }
}