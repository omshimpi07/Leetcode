/*
3360. Stone Removal Game

Alice and Bob are playing a game where they take turns removing stones from a pile, with Alice going first.
Alice starts by removing exactly 10 stones on her first turn.
For each subsequent turn, each player removes exactly 1 fewer stone than the previous opponent.
The player who cannot make a move loses the game.
Given a positive integer n, return true if Alice wins the game and false otherwise.

Example 1: Input: n = 12 Output: true

Explanation: Alice removes 10 stones on her first turn, leaving 2 stones for Bob.
Bob cannot remove 9 stones, so Alice wins.

Difficulty : Easy
*/

class Solution {
    public boolean canAliceWin(int n) {
        
        // int first = 10;

        // boolean aliceWins = true;
        // while(n >= 0){

        //     n -= first;
        //     first--;
        //     aliceWins = !aliceWins;
            
        // }

        // return aliceWins;

        return (n >= 10 && n <= 18) ||
               (n >= 27 && n <= 33) ||
               (n >= 40 && n <= 44) ||
               (n >= 49 && n <= 50);



    }
}