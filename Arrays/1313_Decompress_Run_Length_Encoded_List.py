"""
1313. Decompress Run-Length Encoded List

We are given a list nums of integers representing a list compressed with run-length encoding.
Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
Return the decompressed list.

Example 1: Input: nums = [1,2,3,4] Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].

Diifficulty : easy

Approach : Array
1. Initialize an empty list result to store the decompressed elements.
2. Iterate through the nums array in steps of 2 (i.e., for each pair [freq, val]).
3. For each pair, append the value val to the result list freq times.
4. Return the result list.

Time Complexity : O(n) where n is the length of the input list nums. We iterate through the list once and perform constant time operations for each element.
Space Complexity : O(m) where m is the total number of elements in the decompressed list. In the worst case, we may need to store all elements in the result list.

"""

class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        # size = 0

        # for i in range(0, len(nums), 2):
        #     size += nums[i]

        # ans = [0] * size

        # index = 0

        # for i in range(0, len(nums), 2):
        #     freq = nums[i]
        #     val = nums[i + 1]

        #     while freq > 0:
        #         ans[index] = val
        #         index += 1
        #         freq -= 1

        # return ans

        result = []

        for i in range(0, len(nums), 2):
            freq = nums[i]
            val = nums[i + 1]

            while freq > 0:
                result.append(val)
                freq -= 1

        return result