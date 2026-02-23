/*
Problem: 2785. Sort Vowels in a String
Link: https://leetcode.com/problems/sort-vowels-in-a-string/
Difficulty: Medium

Approach:
1. Store vowels in a set
2. Extract all vowels
3. Sort vowels using ASCII order
4. Reinsert vowels while keeping consonants fixed

Time Complexity: O(n log n)
Space Complexity: O(n)
*/



import java.util.*;

public class Solution {
    public String sortVowels(String s) {
        Set<Character> vowelsSet = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );

        // 1. Extract all vowels
        List<Character> vowelsList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowelsSet.contains(c)) {
                vowelsList.add(c);
            }
        }

        // 2. Sort vowels by ASCII value
        Collections.sort(vowelsList);

        // 3. Build the result string
        StringBuilder result = new StringBuilder();
        int idx = 0; // pointer for vowelsList
        for (char c : s.toCharArray()) {
            if (vowelsSet.contains(c)) {
                result.append(vowelsList.get(idx++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.sortVowels("lEetcOde")); // lEOtcede
        System.out.println(sol.sortVowels("lYmpH"));    // lYmpH
    }
}