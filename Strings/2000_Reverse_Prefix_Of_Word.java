/*
2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

Example 1: Input: word = "abcdefd", ch = "d" Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".

Difficuty: Easy

Approach:
1. Check if the character ch exists in the word. If not, return the original word
2. Find the index of the first occurrence of ch in the word.
3. Convert the word into a character array to facilitate in-place reversal.
4. Use two pointers, left and right, to reverse the characters in the array from index 0 to the index of ch.
5. Convert the character array back to a string and return it.

Time Complexity: O(n), where n is the length of the word. We may need to traverse the entire string to find the character and reverse the segment.
Space Complexity: O(n), for the character array used to store the word.

*/

class Solution {
    public String reversePrefix(String word, char ch) {
        
        if (word.indexOf(ch) == -1) { 
            return word; 
        }

        int index = 0;
        for(int i = 0; i< word.length(); i++){

            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }

        char arr[]= word.toCharArray();

        int left = 0; 
        int right = index;
        while(left < right){

            char temp= arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }

        return new String(arr);




    }
}