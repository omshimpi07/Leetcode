/*
3718. Smallest Missing Multiple Of K
Given an integer array nums and an integer k, return the smallest positive integer that is a multiple of k and does not appear in nums.
A positive integer x is a multiple of k if there exists an integer n such that x = n * k.

Example 1:Input: nums = [1,2,3,4], k = 2 Output: 6

Difficulty : easy

Approach : HashSet.
1. Create a HashSet to store all the numbers in the nums array for O(1) lookup.
2. Initialize a variable multiple to k, which represents the current multiple of k we are checking.
3. Use a while loop to check if the current multiple is present in the HashSet:
   a. If it is present, increment the multiple by k to check the next multiple.
   b. If it is not present, break the loop as we have found the smallest missing multiple.  
4. Return the value of multiple, which is the smallest positive integer that is a multiple of k and does not appear in nums.

Time complexity: O(n) where n is the length of the nums array, since we are storing all numbers in a HashSet and checking for the presence of multiples.
Space complexity: O(n) for storing the numbers in the HashSet.

 */

class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        
        HashSet<Integer> set = new HashSet<>();

        // Store all numbers
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int multiple = k;

        // Keep checking multiples of k
        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }
}