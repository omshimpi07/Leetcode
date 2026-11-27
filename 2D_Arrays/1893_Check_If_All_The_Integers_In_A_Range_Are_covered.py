"""
1893. Check if All the Integers in a Range Are Covered

You are given a 2D integer array ranges and two integers left and right. Each ranges[i] = [starti, endi] represents an inclusive interval between starti and endi.
Return true if each integer in the inclusive range [left, right] is covered by at least one interval in ranges. Return false otherwise.
An integer x is covered by an interval ranges[i] = [starti, endi] if starti <= x <= endi.

Example 1: Input: ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5 Output: true
Explanation: Every integer between 2 and 5 is covered:
- 2 is covered by the first range.
- 3 and 4 are covered by the second range.
- 5 is covered by the third range.

Difficulty : Easy
"""

class Solution:
    def isCovered(self, ranges: list[list[int]], left: int, right: int) -> bool:
        # covered = set()

        # for i in range(len(ranges)):

        #     for j in range(ranges[i][0], ranges[i][1] + 1):

        #         covered.add(j)

        # for i in range(left, right + 1):

        #     if i not in covered:
        #         return False

        # return True

        # visited = [False] * 51

        # for i in range(len(ranges)):

        #     start = ranges[i][0]
        #     end = ranges[i][1]

        #     for j in range(start, end + 1):
        #         visited[j] = True

        # for i in range(left, right + 1):

        #     if not visited[i]:
        #         return False

        # return True

        diff = [0] * 52

        total = 0

        for i in range(len(ranges)):

            start = ranges[i][0]
            end = ranges[i][1]

            diff[start] += 1
            diff[end + 1] -= 1

        for i in range(right + 1):

            total += diff[i]

            if i >= left and total == 0:
                return False

        return True