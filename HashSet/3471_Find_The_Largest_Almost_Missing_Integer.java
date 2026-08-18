/*
3471. Find The Largest Almost Missing Integer
You are given an integer array nums and an integer k. An integer x is called almost missing if it appears in exactly one subarray of size k in nums.
Return the largest almost missing integer. If no such integer exists, return -1.

Example 1: Input: nums = [1,2,3,4], k = 2 Output: 4 Explanation: The subarrays of size 2 are: - [1,2] which contains 1 and 2. - [2,3] which contains 2 and 3. - [3,4] which contains 3 and 4. The integers that appear in exactly one subarray are: - 1 appears in [1,2]. - 4 appears in [3,4]. The largest almost missing integer is 4.
Example 2: Input: nums = [1,2,3,4], k = 3 Output: -1 Explanation: The subarrays of size 3 are: - [1,2,3] which contains 1, 2 and 3. - [2,3,4] which contains 2, 3 and 4. There is no integer that appears in exactly one subarray.

Difficulty : medium

Approach : HashSet.
1. Create a HashMap to store the frequency of each integer that appears in the subarrays of size k.
2. Iterate through the array and for each subarray of size k, use a HashSet to keep track of the unique integers in that subarray. Update their frequency in the HashMap.
3. After processing all subarrays, iterate through the HashMap to find the integers that have a frequency of exactly 1 (almost missing integers).
4. Keep track of the largest almost missing integer found during this iteration.
5. Return the largest almost missing integer, or -1 if no such integer exists.

Time Complexity: O(n × k) where n is the length of the input array and k is the size of the subarray, since we are iterating through the array and for each subarray, we are using a HashSet to track unique integers.
Space Complexity: O(n + k) for the HashMap and HashSet used to store the frequencies and unique integers, respectively.

*/

class Solution {
    public int largestInteger(int[] nums, int k) {
        //time O(n × k) space O(n + k)
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
        }
        int max = -1;

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
            max = Math.max(max, num);
            }
        }
        return max;
        

    }
}