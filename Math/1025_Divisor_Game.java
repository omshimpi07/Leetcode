/*
1025. Divisor Game
Alice and Bob take turns playing a game, with Alice starting first.
Initially, there is a number n on the chalkboard. On each player's turn, that player
makes a move consisting of:
Choosing any x with 0 < x < n and n % x == 0.
Replacing the number n on the chalkboard with n - x.
Display the winner of the game, assuming both players play optimally. Return true if Alice wins, or false if Bob wins.
Example 1: Input: n = 2 Output: true
Explanation: Alice chooses 1, and Bob has no more moves.
Example 2: Input: n = 3 Output: false

Difficulty : easy

Approach : Math.
1. The game can be analyzed using a mathematical approach. The key observation is that if n is even, Alice can always win by choosing x = 1, which leaves Bob with an odd number. If n is odd, Alice will leave Bob with an even number, and Bob can then choose x = 1 to leave Alice with an odd number again. This pattern continues until one player cannot make a move.
2. Therefore, the winner can be determined by checking if n is even or odd. If n is even, Alice wins; if n is odd, Bob wins.
The time complexity of this approach is O(1) since it only requires a single check of the parity of n. The space complexity is also O(1) as no additional data structures are used.
Space complexity: O(1) since we are using a constant amount of space for the calculations.

*/

class Solution {
    public boolean divisorGame(int n) {
        return n % 2 == 0;
        // boolean[] dp = new boolean[n + 1];

        // for (int i = 2; i <= n; i++) {
        //     for (int x = 1; x < i; x++) {
        //         if (i % x == 0 && !dp[i - x]) {
        //             dp[i] = true;
        //             break;
        //         }
        //     }
        // }

        // return dp[n];
    }
}