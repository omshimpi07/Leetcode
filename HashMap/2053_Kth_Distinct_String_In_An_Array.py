"""
2053.Kth Distinct String in an Array
A string is distinct if it is present only once in an array.
Given an array of strings arr, and an integer k, return the kth distinct string present in
arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.

Example 1: Input: arr = ["d","b","c","b","c","a"], k = 2 Output: "a" 
Explanation:The only distinct strings in arr are "d" and "a".   
The 2nd distinct string is "a".

Example 2:   Input: arr = ["aaa","aa","a"], k = 1 Output: "aaa"
Explanation:
All strings in arr are distinct, so the 1st distinct string is "aaa".

Difficulty : easy

Approach : HashMap.
1. Create a HashMap to count the frequency of each string in the array.
2. Iterate through the array again, and for each string, check its frequency in the HashMap. If the frequency is 1, it is a distinct string.
3. Keep a counter to track how many distinct strings have been found. When the counter reaches
    k, return the current string.
4. If the end of the array is reached and fewer than k distinct strings have been found, return an empty string.
Time Complexity: O(n) where n is the length of the array, since we traverse the array twice.
Space Complexity: O(n) for the HashMap to store the frequency of each string.
    
"""

class Solution:
    def kthDistinct(self, arr, k):
        frequency = {}

        # Count frequency of every string
        for s in arr:
            frequency[s] = frequency.get(s, 0) + 1

        # Traverse in original order
        for s in arr:
            if frequency[s] == 1:
                k -= 1

                if k == 0:
                    return s

        return ""
