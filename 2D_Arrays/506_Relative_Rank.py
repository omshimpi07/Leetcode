"""
506. Relative Ranks

You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.

Example 1:Input: score = [5,4,3,2,1] Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].

Difficulty : easy

Approach : Sorting.
1. Create a 2D array to store the scores along with their original indices.
2. Sort the 2D array based on the scores in descending order.
3. Iterate through the sorted array and assign ranks based on the index in the sorted order.

Time Complexity: O(n log n) for sorting the scores.
Space Complexity: O(n) for the 2D array and the answer array.

"""

class Solution:
    def findRelativeRanks(self, score: list[int]) -> list[str]:
        # indexes = list(range(len(score)))

        # indexes.sort(key=lambda i: score[i], reverse=True)

        # answer = [""] * len(score)

        # for rank in range(len(indexes)):

        #     original_index = indexes[rank]

        #     if rank == 0:
        #         answer[original_index] = "Gold Medal"

        #     elif rank == 1:
        #         answer[original_index] = "Silver Medal"

        #     elif rank == 2:
        #         answer[original_index] = "Bronze Medal"

        #     else:
        #         answer[original_index] = str(rank + 1)

        # return answer

        arr = []

        for i in range(len(score)):
            arr.append([score[i], i])

        arr.sort(key=lambda x: x[0], reverse=True)

        answer = [""] * len(score)

        for rank in range(len(arr)):

            original_index = arr[rank][1]

            if rank == 0:
                answer[original_index] = "Gold Medal"

            elif rank == 1:
                answer[original_index] = "Silver Medal"

            elif rank == 2:
                answer[original_index] = "Bronze Medal"

            else:
                answer[original_index] = str(rank + 1)

        return answer