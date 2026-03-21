/*  
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.If there is no common prefix, return an empty string "".

Example 1: Input: strs = ["flower","flow","flight"] Output: "fl"
Example 2: Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200 , strs[i] consists of only lowercase English letters.

Difficulty: Easy

Approach:
1. Check if the input array is empty. If it is, return an empty string.
2. Initialize a variable to store the longest common prefix, starting with the first string in the array.
3. Iterate through the characters of the first string and compare them with the corresponding characters in the other strings.
4. If a mismatch is found or the end of any string is reached, return the longest common prefix found so far.
Time Complexity: O(S) where S is the sum of all characters in all strings in the array.
Space Complexity: O(1) if we don't consider the output string, otherwise O(m) where m is the length of the longest common prefix.
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0){
            return "";
        }
        String output = "";
        for(int i = 0; i < strs[0].length() ;i++){

            char ch = strs[0].charAt(i);

            for(int j = 1; j< strs.length;j++){
                
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return output;
                }

            }
            output += ch;
        }
        return output;
    }
}

    