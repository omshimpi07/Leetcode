/*
1528. Shuffle String
you are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
return the shuffled string.

Example 1: Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3] Output: "leetcode"

Difficulty : easy

Approach : Array.
1. Create a character array of the same length as the input string.
2. Iterate through the input string and for each character, place it in the character array at the position specified by the corresponding index in the indices array.
3. Convert the character array back to a string and return it.
Time Complexity: O(n) where n is the length of the input string, since we are iterating through the string once.
Space Complexity: O(n) for the character array used to store the shuffled string.

*/

class Solution {
    public String restoreString(String s, int[] indices) {


        char[] ans = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {

            ans[indices[i]] = s.charAt(i);

        }

        return new String(ans);


    }
}