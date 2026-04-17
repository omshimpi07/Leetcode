/*  
997. Find the Town Judge

In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
If the town judge exists, then:
The town judge trusts nobody.

Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
Given an array trust where trust[i] = [a, b] representing that the person labeled a trusts the person labeled b, return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
Example 1: Input: n = 2, trust = [[1,2]] Output: 2
Example 2: Input: n = 3, trust = [[1,3],[2,3]] Output: 3
Example 3: Input: n = 3, trust = [[1,3],[2,3],[3,1]] Output: -1

Difficulty : easy
Approach:   
1. Create two arrays, indegree and outdegree, of size n+1 to keep track of the number of people who trust each person and the number of people each person trusts, respectively.
2. Iterate through the trust array and update the indegree and outdegree arrays accordingly.
3. After processing the trust array, iterate through the people from 1 to n and check if there is a person who has an indegree of n-1 (trusted by everyone else) and an outdegree of 0 (trusts nobody). If such a person exists, return their label; otherwise, return -1.
Time Complexity: O(n + m) where n is the number of people and m is the length of the trust array.
Space Complexity: O(n) for the indegree and outdegree arrays.

*/

class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] indegree = new int[n+1];
        int[] outdegree = new int[n+1];

        for(int[] t : trust){
            outdegree[t[0]]++;
            indegree[t[1]]++;
            }   

        for(int i = 1; i <= n; i++){
            if(indegree[i] == n-1 && outdegree[i] == 0){
                return i;
            }
        }

    return -1;
    }
}