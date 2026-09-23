/*
2586. Count the Number of Vowel Strings in Range
You are given a 0-indexed array of string words and two integers left and right.
A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.
Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].

Example 1: Input: words = ["are","amy","u"], left = 0, right = 2 Output: 2
Explanation: 
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.

Difficulty : easy

Approach : Iteration.
1. Initialize a count variable to 0.
2. Iterate through the words array from index left to right.
3. For each word, check if the first and last characters are vowels.
4. If both characters are vowels, increment the count.
5. Return the count after the loop ends.

Time Complexity: O(n) where n is the number of words in the range [left, right].
Space Complexity: O(1) since we are using a constant amount of space for the count variable and no additional data structures.

*/

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        
        // int count = 0;

        // for(int i = left; i <= right ; i++){

        
        // if((words[i].charAt(0) == 'a' ||
        //     words[i].charAt(0) == 'i' ||
        //     words[i].charAt(0) == 'o' ||
        //     words[i].charAt(0) == 'u' ||
        //     words[i].charAt(0) == 'e') && 
            
        //     (words[i].charAt(words[i].length() - 1) == 'a' ||
        //     words[i].charAt(words[i].length() - 1) == 'i' ||
        //     words[i].charAt(words[i].length() - 1) == 'o' ||
        //     words[i].charAt(words[i].length() - 1) == 'u' ||
        //     words[i].charAt(words[i].length() - 1) == 'e')) {

        //     count++;
        // }
        // }
        // return count;

        int count = 0;

        for (int i = left; i <= right; i++) {

            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);

            if (isVowel(first) && isVowel(last)) {
                count++;
            }
        }

        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}
    
