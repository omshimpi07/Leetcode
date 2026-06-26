/*
17. Letter Combinations of a Phone Number
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the
number could represent. Return the answer in any order.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.     
example 1: Input: digits = "23" Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
example 2: Input: digits = "" Output: []
example 3: Input: digits = "2" Output: ["a","b","c"]

Difficulty : medium

Approach : Backtracking.
1. Create a mapping of digits to letters as per the telephone buttons.
2. Use a backtracking function to generate all combinations:
    a. If the current index is equal to the length of the input digits, add the current combination to the result list.
    b. Otherwise, get the letters corresponding to the current digit and iterate through them.
    c. For each letter, append it to the current combination and recursively call the backtracking function for the next index.
    d. After returning from recursion, remove the last letter (backtrack) to explore other combinations.
3. Return the result list containing all possible letter combinations.

Time Complexity: O(3^N * 4^M) where N is the number of digits that map to 3 letters (like 2, 3, 4, 5, 6, 8) and M is the number of digits that map to 4 letters (like 7 and 9). This is because for each digit, we have multiple choices (3 or 4), leading to a combinatorial explosion.    
Space Complexity: O(N) for the recursion stack and the current combination being built, where N is the length of the input digits.

*/

class Solution {

    List<String> ans = new ArrayList<>();

    String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return ans;

        backtrack(digits, 0, new StringBuilder());

        return ans;
    }

    private void backtrack(String digits, int index, StringBuilder current) {

        // Base Case
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        // Get letters for current digit
        String letters = map[digits.charAt(index) - '0'];

        // Try every letter
        for (char ch : letters.toCharArray()) {

            // Choose
            current.append(ch);

            // Explore
            backtrack(digits, index + 1, current);

            // Undo (Backtrack)
            current.deleteCharAt(current.length() - 1);
        }
    }
}