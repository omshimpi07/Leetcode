/*
646. Maximum Length of Pair Chain

You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.
A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.
Return the length longest chain which can be formed.
You do not need to use up all the given intervals. You can select pairs in any order.

Example 1: Input: pairs = [[1,2],[2,3],[3,4]] Output: 2
Explanation: The longest chain is [1,2] -> [3,4].
Example 2: Input: pairs = [[1,2],[7,8],[4,5]] Output: 3
Explanation: The longest chain is [1,2] -> [4,5] -> [7,8].

Difficulty : medium

Approach : Greedy.
1. Sort the pairs based on the second element of each pair in ascending order.
2. Initialize two variables: chainEnd to keep track of the end of the current chain and
    chainLength to count the number of pairs in the longest chain.
3. Iterate through the sorted pairs starting from the second pair:
    a. If the first element of the current pair is greater than chainEnd, it means we can add this pair to the chain.
    b. Increment chainLength and update chainEnd to the second element of the current pair.
4. After iterating through all pairs, return chainLength as the length of the longest chain.

Time Complexity: O(n log n) for sorting the pairs, where n is the number of pairs. The iteration through the pairs takes O(n) time.
Space Complexity: O(1) since we are using a constant amount of space for variables.

 */

class Solution {
    public int findLongestChain(int[][] pairs) {

        // Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        
        int chainend = pairs[0][1];
        int chainlen = 1;
        

        for(int i = 1; i< pairs.length ; i++){

            if(pairs[i][0] > chainend){

                
                chainlen++;
                chainend = pairs[i][1];
            }

        }
        return chainlen;
        
    }
}