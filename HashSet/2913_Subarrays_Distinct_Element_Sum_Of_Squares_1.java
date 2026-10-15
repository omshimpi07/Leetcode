/*
2913. Subarrays Distinct Element Sum of Squares I

You are given a 0-indexed integer array nums.
The distinct count of a subarray of nums is defined as:
Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length. Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].
Return the sum of the squares of distinct counts of all subarrays of nums.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1: Input: nums = [1,2,1] Output: 15
Explanation: Six possible subarrays are:
[1]: 1 distinct value
[2]: 1 distinct value
[1]: 1 distinct value
[1,2]: 2 distinct values
[2,1]: 2 distinct values
[1,2,1]: 2 distinct values
The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 + 22 + 22 + 22 = 15.

Difficulty: Medium

Approach:
1. Initialize a variable sum to 0 to keep track of the total sum of squares of
2. Iterate through the array nums using two nested loops to generate all possible subarrays.
3. For each subarray, use a HashSet to store the distinct elements.
4. Calculate the size of the HashSet (which represents the distinct count) and add its square to the sum variable.
5. Return the final value of sum after processing all subarrays.

Time Complexity: O(n^2) - The solution involves two nested loops to generate all possible subarrays, where n is the length of the input array nums.
Space Complexity: O(n) - The HashSet used to store distinct elements can grow up to

*/

class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));

                int count = set.size();
                sum += count * count;
            }
        }

        return sum;


    }
}