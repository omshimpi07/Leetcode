/*
3903. Smallest Stable Index I
You are given an integer array nums of length n and an integer k.

For each index i, define its instability score as max(nums[0..i]) - min(nums[i..n - 1]).
In other words:
max(nums[0..i]) is the largest value among the elements from index 0 to index i.
min(nums[i..n - 1]) is the smallest value among the elements from index i to index n - 1.
An index i is called stable if its instability score is less than or equal to k.
Return the smallest stable index. If no such index exists, return -1.

Example 1: Input: nums = [5,0,1,4], k = 3 Output: 3
Explanation:
At index 0: The maximum in [5] is 5, and the minimum in [5, 0, 1, 4] is 0, so the instability score is 5 - 0 = 5.
At index 1: The maximum in [5, 0] is 5, and the minimum in [0, 1, 4] is 0, so the instability score is 5 - 0 = 5.
At index 2: The maximum in [5, 0, 1] is 5, and the minimum in [1, 4] is 1, so the instability score is 5 - 1 = 4.
At index 3: The maximum in [5, 0, 1, 4] is 5, and the minimum in [4] is 4, so the instability score is 5 - 4 = 1.
This is the first index with an instability score less than or equal to k = 3. Thus, the answer is 3.

Difficulty : easy

Approach : Prefix and Suffix Arrays.
1. Create a suffix array to store the minimum value from index i to n-1 for each index i.
2. Create a variable to keep track of the maximum value from index 0 to i for each index i.
3. compae and calculate PrefixMax - SuffixMin if its <= k return i els ereturn the -1.

Time Compexity : O(n);
Space Complexity : O(n);

*/

class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int[] suffixMin = new int[nums.length];

        suffixMin[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int prefixMax = 0;

        for(int i = 0; i < nums.length ; i++){
            
            prefixMax = Math.max(nums[i ], prefixMax);

            if(prefixMax - suffixMin[i] <= k){
                return i;
            }

        }
        return -1;

        
    }
}
