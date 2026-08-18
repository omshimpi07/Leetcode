"""
3471. Find The Largest Almost Missing Integer
You are given an integer array nums and an integer k. An integer x is called almost missing if it appears in exactly one subarray of size k in nums.
Return the largest almost missing integer. If no such integer exists, return -1.

Example 1: Input: nums = [1,2,3,4], k = 2 Output: 4 Explanation: The subarrays of size 2 are: - [1,2] which contains 1 and 2. - [2,3] which contains 2 and 3. - [3,4] which contains 3 and 4. The integers that appear in exactly one subarray are: - 1 appears in [1,2]. - 4 appears in [3,4]. The largest almost missing integer is 4.
Example 2: Input: nums = [1,2,3,4], k = 3 Output: -1 Explanation: The subarrays of size 3 are: - [1,2,3] which contains 1, 2 and 3. - [2,3,4] which contains 2, 3 and 4. There is no integer that appears in exactly one subarray.

Difficulty : medium

Approach : HashSet
1. Use a sliding window of size k to iterate through the array.
2. For each window, use a set to track the unique numbers in that window.
3. Use a dictionary to count how many windows each number appears in.
4. After processing all windows, find the largest number that appears in exactly one window.
5. Return that number, or -1 if no such number exists.

Time Complexity : O(n × k) where n is the length of nums and k is the size of the subarray.
Space Complexity : O(n + k) where n is the number of unique integers in nums and k is the size of the subarray.

"""
class Solution:
    def largestInteger(self, nums, k):
        count = {}

        for i in range(len(nums) - k + 1):
            seen = set()

            # Current window: nums[i : i + k]
            for j in range(i, i + k):
                seen.add(nums[j])

            # Count each number once for this window
            for num in seen:
                count[num] = count.get(num, 0) + 1

        answer = -1

        for num in count:
            if count[num] == 1:
                answer = max(answer, num)

        return answer

        # //time O(n × k) space O(n + k)