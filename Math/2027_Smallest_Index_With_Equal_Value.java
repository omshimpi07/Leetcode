/*
2057. Smallest Index With Equal Value
Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.
x mod y denotes the remainder when x is divided by y.

Example 1: Input: nums = [0,1,2] Output: 0
Explanation: 
i=0: 0 mod 10 = 0 == nums[0].
i=1: 1 mod 10 = 1 == nums[1].
i=2: 2 mod 10 = 2 == nums[2].
All indices have i mod 10 == nums[i], so we return the smallest index 0.

Diificulty: Easy

Approach:
1. Iterate through the array nums using a for loop.
2. For each index i, check if i mod 10 is equal to nums[i].
3. If a match is found, return the index i immediately as it is the smallest index
4. If the loop completes without finding a match, return -1 to indicate that no such index exists.

Time Complexity: O(n), where n is the length of the nums array. We may need to traverse the entire array to find the index.
Space Complexity: O(1), as we are using a constant amount of space regardless of the

*/

class Solution {
    public int smallestEqual(int[] nums) {
        for(int i = 0; i< nums.length ; i++){

            if(i % 10 == nums[i] ){
                return i;
                
            }
        }
        return -1;


    }
}