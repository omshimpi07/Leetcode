/*
1768. Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example 1: Input: word1 = "abc", word2 = "pqr" Output: "apbqcr" Explanation: The merged string will be merged as so: word1:  a   b   c word2:    p   q   r merged:  a p b q c r
Example 2: Input: word1 = "ab", word2 = "pqrs" Output: "apbqrs" Explanation: Notice that as word2 is longer, "rs" is appended to the end. word1:  a   b word2:    p   q   r   s merged:  a p b q   r   s
Example 3: Input: word1 = "abcd", word2 = "pq" Output: "apbqcd" Explanation: Notice that as word1 is longer, "cd" is appended to the end. word1:  a   b   c   d word2:    p   q merged:  a p b q c   d

Difficulty : easy

Approach:
1. Initialize two pointers, i and j, to keep track of the current index for word1 and word2 respectively.
2. Use a StringBuilder to build the merged string efficiently.  
3. Use a while loop to iterate through both strings until one of the pointers reaches the end of its respective string.
4. In each iteration, append the current character from word1 and word2 to the StringBuilder and increment the pointers.
5. After the loop, check if there are any remaining characters in either word1 or word2 and append them to the StringBuilder.
6. Finally, convert the StringBuilder to a string and return it as the merged result.
Time Complexity: O(n) where n is the total length of the merged string (length of word1 + length of word2).
Space Complexity: O(n) for the StringBuilder that holds the merged string.


*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder sb = new StringBuilder(n1 + n2);

        int i = 0; 
        int j = 0; 
    
        while(i < n1 && j < n2){
            sb.append(word1.charAt(i));
            i++;
           
            sb.append(word2.charAt(j));
            j++;
            
        }
        while(i < n1){
            sb.append(word1.charAt(i));
            i++;
            
        }
        while(j < n2){
            sb.append(word2.charAt(j));
            j++;
            
        }
        return sb.toString();
    }
}