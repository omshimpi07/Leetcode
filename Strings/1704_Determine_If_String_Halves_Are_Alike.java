/*
1704. Determine if String Halves Are Alike

You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
Return true if a and b are alike. Otherwise, return false.

Example 1: Input: s = "book"Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2: Input: s = "textbook" Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.

Diificulty : easy

Approach : Two Pointers.
1. Split the string into two halves.
2. Count the number of vowels in each half.
3. Compare the counts of vowels in both halves and return true if they are equal, otherwise return false.
Time Complexity: O(n) where n is the length of the input string, since we are iterating through half of the string to count vowels.
Space Complexity: O(1) since we are using a constant amount of space for counting vowels and not using any additional data structures that scale with input size.

*/

class Solution {
    public boolean halvesAreAlike(String s) {
    //     int mid = s.length() / 2;

    //     int countA = 0;
    //     int countB = 0;

    //     for (int i = 0; i < mid; i++) {

    //         if (isVowel(s.charAt(i))) {
    //             countA++;
    //         }
    //     }

    //     for (int i = mid; i < s.length(); i++) {

    //         if (isVowel(s.charAt(i))) {
    //             countB++;
    //         }
    //     }

    //     return countA == countB;
    // }

    // private boolean isVowel(char c) {
    //     return c == 'a' || c == 'e' || c == 'i' || c == 'o' ||
    //            c == 'u' || c == 'A' || c == 'E' || c == 'I' ||
    //            c == 'O' || c == 'U';
    // }


        int mid = s.length() / 2;
        int count = 0;

        for (int i = 0; i < mid; i++) {

            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (isVowel(s.charAt(i + mid))) {
                count--;
            }
        }

        return count == 0;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}
