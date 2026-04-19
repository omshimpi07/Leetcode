/*
1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1: Input: nums = [1,2,3,1,1,3] Output: 4
Example 2: Input: nums = [1,1,1,1] Output: 6
Example 3: Input: nums = [1,2,3] Output: 0
Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
Difficulty : easy
Approach:
1. Use a HashMap to count the frequency of each number in the input array.
2. For each number, if it appears k times, then the number of good pairs that can be formed with that number is given by the formula: k * (k - 1) / 2.
3. Sum up the counts of good pairs for all numbers to get the total number of good pairs.
Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(n) for the HashMap to store the frequency of each number.

*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                count += map.get(num);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    
    }
}