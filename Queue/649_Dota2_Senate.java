/*
649. Dota2 Senate   
In the world of Dota2, there are two parties: the Radiant and the Dire. The Dota2 senate consists of senators coming from two parties. Now the senate wants to make a decision about a change in the Dota2 game. The voting for this change is a round-based procedure. In each round, each senator can exercise one of the two rights:
Ban one senator's right: A senator can make another senator lose all his rights in this and all the following rounds.
Announce the victory: If this senator found the senators who still have rights to vote are all from the same party, he can announce the victory and decide on the change in the game.
Given a string senate representing each senator's party belonging. The character 'R' and 'D' represent the Radiant party and the Dire party respectively. Then if there are n senators, the size of the given string will be n.
The round-based procedure starts from the first senator to the last senator in the given order. This procedure will last until the end of voting. All the senators who have lost their rights will be skipped during the procedure.
Suppose every senator is smart enough and will play the best strategy for his own party, predict which party will finally announce the victory and change the Dota2 game. The output should be "Radiant" or "Dire".

Example 1: Input: senate = "RD" Output: "Radiant"
Explanation: The first senator comes from Radiant and he can just ban the next senator's right in the round 1. And the second senator can't exercise any rights anymore since his right has been banned. And in the round 2, the first senator can just announce the victory since he is the only guy in the senate who can vote.

Example 2: Input: senate = "RDD" Output: "Dire"
Explanation: The first senator comes from Radiant and he can just ban the next senator's right in the round 1. And the second senator can't exercise any rights anymore since his right has been banned. And in the round 2, the third senator can just ban the first senator's right since he is the only guy in the senate who can vote. And in the round 3, the third senator can just announce the victory since he is the only guy in the senate who can vote.

Example 3: Input: senate = "RRDDD" Output: "Dire"
Explanation: The first senator comes from Radiant and he can just ban the next senator's right in the round 1. And the second senator can't exercise any rights anymore since his right has been banned. And in the round 2, the third senator comes from Radiant and he can just ban the next senator's right. And the fourth senator can't exercise any rights anymore since his right has been banned. And in the round 3, the fifth senator can just ban the first senator's right since he is the only guy in the senate who can vote. And in the round 4, the fifth senator can just announce the victory since he is the only guy in the senate who can vote.

Difficulty : medium

Approach : Queue.
1. Use two queues to keep track of the indices of the senators from each party.
2. Iterate through the input string and add the indices of the 'R' senators to one queue and the indices of the 'D' senators to another queue.
3. While both queues are not empty, compare the front elements of both queues. The senator with the smaller index gets to ban the other senator and is then re-added to the end of its respective queue with an updated index (current index + length of the senate string).
4. Once one of the queues is empty, the other party is declared the winner.

Time Complexity: O(n) where n is the length of the input string, since each senator is processed at most twice (once when they are added to the queue and once when they are banned).
Space Complexity: O(n) for the queues storing the indices of the senators.

*/

class Solution {
    public String predictPartyVictory(String senate) {
        
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        for(int i = 0; i<senate.length();i++){

            if(senate.charAt(i) == 'R'){
                rQueue.add(i);
            }
            if(senate.charAt(i) == 'D'){
                dQueue.add(i);
            }
        }
        int r = 0;
        int d = 0;
        while(!rQueue.isEmpty() && !dQueue.isEmpty()){

            r = rQueue.poll();
            d = dQueue.poll();
            if(r<d){
                rQueue.add(r + senate.length());
            }
            if(d < r){
                dQueue.add(d + senate.length());
            }
        }
        if(rQueue.isEmpty()){
            return "Dire";
        }
        return "Radiant";

    }
}