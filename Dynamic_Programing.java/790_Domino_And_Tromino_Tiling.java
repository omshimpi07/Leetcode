/*
790. Domino and Tromino Tiling
You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.
Given an integer n, return the number of ways to tile an 2 x n board.
Since the answer may be very large, return it modulo 10^9 + 7.

Example 1: Input: n = 3 Output: 5
Explanation: The five different ways are show above.

Example 2: Input: n = 1 Output: 1
Constraints:
1 <= n <= 1000
Difficulty : medium

Approach : Dynamic Programming.
1. Let full[i] be the number of ways to fully tile a 2 x i board.
2. Let partial[i] be the number of ways to tile a 2 x i board with one square missing (which can be filled by a tromino).
3. The recurrence relations are:
   - full[i] = full[i-1] + full[i-2] + 2 * partial[i-1]
   - partial[i] = partial[i-1] + full[i-2]
4. Initialize full[0] = 1, full[1] = 1, partial[0] = 0, and partial[1] = 0.
5. Iterate from 2 to n, updating full[i] and partial[i] using the recurrence relations.

Time Complexity: O(n) where n is the length of the board, since we are iterating through the board length once.
Space Complexity: O(n) for the full and partial arrays storing the number of ways to tile

*/

class Solution {

    public int numTilings(int n) {

        int MOD = 1_000_000_007;

        long[] full = new long[n + 2];
        long[] partial = new long[n + 2];

        full[0] = 1;
        full[1] = 1;

        for (int i = 2; i <= n; i++) {

            full[i] = (full[i - 1] + full[i - 2] + 2 * partial[i - 1]) % MOD;

            partial[i] = (partial[i - 1] + full[i - 2]) % MOD;
        }
        return (int) full[n];
    }
}