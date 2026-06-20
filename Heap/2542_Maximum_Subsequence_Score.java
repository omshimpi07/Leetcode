/*
2542. Maximum Subsequence Score
You are given two 0-indexed integer arrays nums1 and nums2 of equal length n and a positive integer k.
The score of a subsequence of indices taken from nums1 and nums2 is defined as the sum of the selected elements from nums1 multiplied by the minimum of the selected elements from nums2. More formally, if the indices of the selected subsequence are i0, i1, ... , ik - 1 then the score is (nums1[i0] + nums1[i1] + ... + nums1[ik - 1]) * min(nums2[i0], nums2[i1], ... , nums2[ik - 1]).
Return the maximum possible score.

Example 1: Input nums1 = [1,3,3,2], nums2 = [2,1,3,4], k = 3 Output 12 
Explanation : The subsequence of indices (0, 2, 3) has score = (1 + 3 + 2) * min(2, 3, 4) = 6 * 2 = 12.

Example 2: Input nums1 = [4,2,3,1,1], nums2 = [7,5,10,9,6], k = 1 Output 30
Explanation : The subsequence of indices (2) has score = (3) * min(10) = 30.

Difficulty : hard

Approach : Heap.
1. Create an array of pairs where each pair consists of elements from nums2 and nums1.
2. Sort the pairs in descending order based on the elements from nums2.
3. Use a min-heap (priority queue) to keep track of the k largest elements from nums1 corresponding to the selected pairs.
4. Iterate through the sorted pairs and for each pair:
   a. Add the element from nums1 to the min-heap and update the sum of the selected elements from nums1.
   b. If the size of the min-heap exceeds k, remove the smallest element from the min-heap and update the sum accordingly.
   c. If the size of the min-heap is equal to k, calculate the score using the current sum and the element from nums2 of the current pair, and update the maximum score if necessary.

   Time Complexity: O(n log n) for sorting the pairs and O(n log k) for iterating through the pairs and maintaining the min-heap, where n is the length of the input arrays.
Space Complexity: O(n) for the array of pairs and O(k) for the min-
heap storing the selected elements from nums1.
*/

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {

        int n = nums1.length;
        int[][] pairs = new int[n][2];      

        for(int i = 0; i < n; i++) {
            pairs[i][0] = nums2[i];
            pairs[i][1] = nums1[i];
        }

        Arrays.sort(pairs, (a,b) -> b[0] - a[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        long sum = 0;
        long ans = 0;

        for(int[] pair : pairs) {

            pq.offer(pair[1]);
            sum += pair[1];

            if(pq.size() > k) {
                
                sum -= pq.poll();
            }

            if(pq.size() == k) {

                ans = Math.max(ans, sum * pair[0]);
            }
        }
        return ans;
    }
}