"""1025. Divisor Game
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
Approach : Dynamic Programming

"""

class Solution:
    def divisorGame(self, n: int) -> bool:
        # dp = [False] * (n + 1)

        # for i in range(2, n + 1):

        #     for x in range(1, i):

        #         if i % x == 0 and not dp[i - x]:
        #             dp[i] = True
        #             break

        # return dp[n]

        return n % 2 == 0