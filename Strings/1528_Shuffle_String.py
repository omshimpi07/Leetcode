""" 
1528. Shuffle String
you are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
return the shuffled string.

Example 1: Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3] Output: "leetcode"

Difficulty : easy

Approach : List.
1. Initialize an empty list ans of the same length as s to store the shuffled characters.
2. Iterate through each index i in the range of the length of s:
    a. Set ans[indices[i]] to s[i], which places the character at the correct position in the shuffled string.
3. Join the characters in ans to form the final shuffled string and return it.
Time Complexity : O(n) where n is the length of the string s.
Space Complexity : O(n) where n is the length of the string s.

"""

class Solution:
    def restoreString(self, s: str, indices: list[int]) -> str:

        ans = [""] * len(s)

        for i in range(len(s)):

            ans[indices[i]] = s[i]

        return "".join(ans)