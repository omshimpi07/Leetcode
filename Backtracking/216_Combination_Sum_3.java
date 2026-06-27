/*
216. Combination Sum III
Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
- Only numbers 1 through 9 are used.
- Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

Example 1: Input: k = 3, n = 7 Output: [[1,2,4]]
Example 2: Input: k = 3, n = 9 Output: [[1,2,6],[1,3,5],[2,3,4]]

Difficulty : medium

Approach : Backtracking.
1. Use a backtracking function to generate all combinations:
    a. If the current combination size is equal to k, check if the sum is equal to n. If so, add the combination to the result list.
    b. Otherwise, iterate through numbers from the current start number to 9.
    c. For each number, add it to the current combination and recursively call the backtracking function with the next start number and updated sum.
    d. After returning from recursion, remove the last number (backtrack) to explore other combinations.
2. Return the result list containing all valid combinations.

Time Complexity: O(2^9) since we are exploring all subsets of the numbers
from 1 to 9, but we can prune the search space based on the constraints of k and n.
Space Complexity: O(k) for the recursion stack and the current combination being built, where k is the size of the combination.


*/

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        backtrack(k, n, 1, 0, new ArrayList<>());

        return ans;
    }

    private void backtrack(int k, int target,
                           int start,
                           int sum,
                           List<Integer> current){

        // Base Case
        if(current.size() == k){

            if(sum == target){
                ans.add(new ArrayList<>(current));
            }

            return;
        }

        // Try every number
        for(int num = start; num <= 9; num++){

            // Choose
            current.add(num);

            // Explore
            backtrack(k,
                      target,
                      num + 1,
                      sum + num,
                      current);

            // Undo
            current.remove(current.size()-1);
        }
    }
}