"""646. Maximum Length of Pair Chain

You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.
A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.
Return the length longest chain which can be formed.
You do not need to use up all the given intervals. You can select pairs in any order.

Example 1: Input: pairs = [[1,2],[2,3],[3,4]] Output: 2
Explanation: The longest chain is [1,2] -> [3,4].
Example 2: Input: pairs = [[1,2],[7,8],[4,5]] Output: 3
Explanation: The longest chain is [1,2] -> [4,5] -> [7,8].

Difficulty : medium

Approach:
1. Sort the pairs based on the second element of each pair.
2. Initialize a variable chain_end to the second element of the first pair and a variable chain_len to 1.
3. Iterate through the sorted pairs starting from the second pair.
4. For each pair, check if the first element is greater than chain_end. If it is, increment chain_len and update chain_end to the second element of the current pair.
5. Return chain_len as the length of the longest chain.

Time Complexity: O(n log n) due to sorting the pairs.
Space Complexity: O(1) since we are using a constant amount of extra space.

"""

pairs.sort(key=lambda pair: pair[1])

        chain_end = pairs[0][1]
        chain_len = 1

        for i in range(1, len(pairs)):
            if pairs[i][0] > chain_end:
                chain_len += 1
                chain_end = pairs[i][1]

        return chain_len