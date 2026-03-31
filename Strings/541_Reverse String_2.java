/*
541. Reverse String II
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string. If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:
Input: s = "abcd", k = 2
Output: "bacd"
Constraints:
1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
Difficulty: Easy
Approach:
1. Convert the input string to a character array for in-place modification.
2. Iterate through the character array in steps of 2k, reversing the first k characters for each segment.
3. Handle the cases where there are fewer than k characters left at the end of the string.
Time Complexity: O(n) where n is the length of the input string.
Space Complexity: O(n) for the character array, but O(1) if we consider the input string as mutable and do not count the space used for the output string.
*/

class Solution {
    public String reverseStr(String s, int k) {
        
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n; i += 2*k){
            
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            
            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}