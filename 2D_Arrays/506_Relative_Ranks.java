/*
506. Relative Ranks

You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.

Example 1:Input: score = [5,4,3,2,1] Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].

Difficulty : easy

Approach : Sorting.
1. Create a 2D array to store the scores along with their original indices.
2. Sort the 2D array based on the scores in descending order.
3. Iterate through the sorted array and assign ranks based on the index in the sorted order.

Time Complexity: O(n log n) for sorting the scores.
Space Complexity: O(n) for the 2D array and the answer array.

*/

class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        // Integer[] indexes = new Integer[score.length];

        // for(int i = 0; i < score.length; i++){
        //     indexes[i] = i;
        // }

        // Arrays.sort(indexes, (a, b) -> score[b] - score[a]);
        // // Arrays.sort(indexes, (a, b) -> Integer.compare(score[b], score[a]));
        // String[] answer = new String[score.length];

        // for(int rank = 0; rank < indexes.length; rank++){

        //     int originalIndex = indexes[rank];

        //     if(rank == 0)
        //         answer[originalIndex] = "Gold Medal";
        //     else if(rank == 1)
        //         answer[originalIndex] = "Silver Medal";
        //     else if(rank == 2)
        //         answer[originalIndex] = "Bronze Medal";
        //     else
        //         answer[originalIndex] = String.valueOf(rank + 1);
        // }
        // return answer;

        int n = score.length;

        // 2 columns:
        // column 0 -> score
        // column 1 -> original index
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }

        // Sort by score in descending order
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

        String[] answer = new String[n];

        for (int rank = 0; rank < n; rank++) {

            int originalIndex = arr[rank][1];

            if (rank == 0) {
                answer[originalIndex] = "Gold Medal";
            }
            else if (rank == 1) {
                answer[originalIndex] = "Silver Medal";
            }
            else if (rank == 2) {
                answer[originalIndex] = "Bronze Medal";
            }
            else {
                answer[originalIndex] = String.valueOf(rank + 1);
            }
        }

        return answer;

        
    }
}