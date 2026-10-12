/*
2185. Counting Words With a Given Prefix

You are given an array of strings words and a string pref.
Return the number of strings in words that contain pref as a prefix.
A prefix of a string s is any leading contiguous substring of s.

Example 1: Input: words = ["pay","attention","practice","attend"], pref = "at" Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
Example 2: Input: words = ["leetcode","win","loops","success"], pref = "code" Output: 0
Explanation: There are no strings that contain "code" as a prefix.

Difficulty: Easy

Approach:
1. Initialize a counter variable to keep track of the number of words that have the given prefix
2. Iterate through each word in the words array
3. For each word, check if it starts with the given prefix using the startsWith()
4. If it does, increment the counter variable
5. After iterating through all the words, return the counter variable as the result, which
represents the total number of words that have the given prefix.

Time Complexity: O(n * m), where n is the number of words in the array and m is the average length of the words. In the worst case, we may need to check each character of each word to determine if it starts with the given prefix.
Space Complexity: O(1), as we are using a constant amount of space regardless of the input size.

 */

class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                count++;
            }
        }

        return count;

    }
}