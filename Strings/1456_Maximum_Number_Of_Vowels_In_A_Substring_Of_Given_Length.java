/*
1456. Maximum Number of Vowels in a Substring of Given Length
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.       

Example 1: Input: s = "abciiidef", k = 3 Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2: Input: s = "aeiou", k = 2 Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

Difficulty : easy

Approach:
1. Use a sliding window of size k to count the number of vowels in the first k characters of the string.
2. Initialize a variable maxCount to store the maximum count of vowels found so far, and set it to the count of vowels in the first k characters.
3. Iterate through the string starting from the k-th character, and for each character, update the count of vowels by checking the character that is sliding out of the window and the new character that is sliding into the window.
4. Update maxCount if the new count of vowels is greater than the current maxCount.
5. After iterating through the string, return maxCount as the result.
Time Complexity: O(n) where n is the length of the input string, since we are iterating through the string once.
Space Complexity: O(1) since we are using only a constant amount of extra space to store the count of vowels and the maximum count.

*/
class Solution {
    public int maxVowels(String s, int k) {
        
        int count = 0;
        for(int i = 0; i<k ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                
                count++;
            }
        }
        int maxcount = count;
        for(int i = k ; i<s.length(); i++){
            
            char leftchar = s.charAt(i-k);
            if((leftchar == 'a' ||leftchar == 'e' || leftchar == 'i' 
                || leftchar == 'o' || leftchar == 'u')){
                    count--;
            }
            
            char rightchar = s.charAt(i);
            if((rightchar == 'a' ||rightchar == 'e' || rightchar == 'i' 
                || rightchar == 'o' || rightchar == 'u')){
                    count++;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}