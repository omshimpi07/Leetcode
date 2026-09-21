/*
594. Longest Harmonious Subsequence

We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

Example 1: Input: nums = [1,3,2,2,5,2,3,7] Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].

Example 2: Input: nums = [1,2,3,4] Output: 2
Explanation: The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

Difficulty : easy

Approach : HashMap.
1. Create a HashMap to count the frequency of each number in the array.
2. Iterate through the keys of the HashMap. For each key x, check if x + 1 exists in the map. If it does, calculate the length of the harmonious subsequence as the sum of the frequencies of x and x + 1.
3. Keep track of the maximum length found during the iteration.
4. Return the maximum length after checking all keys.
    
Time Complexity: O(n) where n is the length of the input array, since we traverse the array to build the frequency map and then iterate through the keys of the map.
Space Complexity: O(k) where k is the number of distinct elements in the input array, for storing the frequency counts in the HashMap.

*/

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        // Check x and x + 1
        for (int x : map.keySet()) {

            if (map.containsKey(x + 1)) {

                int length = map.get(x) + map.get(x + 1);

                ans = Math.max(ans, length);
            }
        }

        return ans;
    }
}