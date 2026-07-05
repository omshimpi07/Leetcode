/*
72. Edit Distance

Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
You have the following three operations permitted on a word:

Insert a character
Delete a character
Replace a character
 
Example 1:Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')

Example 2: Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
 
Difficulty : hard
Approach : Dynamic Programming.
1. Use a 2D array dp where dp[i][j] represents the minimum number of operations required to convert the first i characters of word1 to the first j characters of word2.
2. Initialize the first row and first column of the dp array to represent the number of operations required to convert an empty string to the other string (i.e., inserting or deleting characters).
3. Iterate through the characters of both strings, updating the dp array based on whether the characters match or not. If they match, take the value from the diagonal cell; if they don't match, take the minimum of the three possible operations (insert, delete, replace) and add 1.
4. The final answer will be in dp[m][n], where m and n are the lengths of word1 and word2, respectively.
Time Complexity: O(m*n) where m and n are the lengths of word1 and word2, respectively.
Space Complexity: O(m*n) for the dp array, but can be optimized to O(min(m,n)) by using two 1D arrays to store the previous and current rows of the dp array.

*/

class Solution {

    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++){
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++){
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1];

                } else {

                    int delete = dp[i - 1][j];
                    int insert = dp[i][j - 1];
                    int replace = dp[i - 1][j - 1];

                    dp[i][j] = 1 + Math.min(delete, Math.min(insert, replace));
                }
            }
        }
        return dp[m][n];
    }
}