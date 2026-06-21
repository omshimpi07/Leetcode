/*
 * [2462] Total Cost to Hire K Workers

 *
 * You are given a 0-indexed integer array costs where costs[i] is the cost of
 * hiring the i^th worker.
 * 
 * You are also given two integers k and candidates. We want to hire exactly k
 * workers according to the following rules:
 *
 * You will run k sessions and hire exactly one worker in each session.
 * In each hiring session, choose the worker with the lowest cost from either
 * the first candidates workers or the last candidates workers. Break the tie
 * by the smallest index.
 * For example, if costs = [3,2,7,7,1,2] and candidates = 2, then in the first
 * hiring session, we will choose the 4^th worker because they have the lowest
 * cost [3,2,7,7,1,2]. In the second hiring session we will choose 1^st worker
 * because they have the same lowest cost as 4^th worker but they have the
 * smallest index [3,2,7,7,2].
 * If there are fewer than candidates workers remaining in the array, choose
 * the worker with the lowest cost among them. Break the tie by the smallest
 * index.
 * A worker can only be chosen once.
 * Return the total cost to hire exactly k workers.

    * Example 1:
    * Input: costs = [17,12,10,2,7,2,11,20,8], k = 3, candidates = 4
    * Output: 11
    * Explanation: We hire 3 workers in total. The total cost is initially 0.
    * - In the first hiring session, we choose the 3^rd worker with a cost of 2. The
    * total cost = 0 + 2 = 2.
    * - In the second hiring session, we choose the 4^th worker with a cost of 2. The
    * total cost = 2 + 2 = 4.
    * - In the third hiring session, we choose the 2^nd worker with a cost of 7. The
    * total cost = 4 + 7 = 11.

    * Difficulty : medium

    * Approach : Heap.
    * 1. Use a min-heap (priority queue) to keep track of the lowest cost workers from the first and last candidates.
    * 2. Initialize two pointers, left and right, to point to the start and
    * end of the costs array, respectively.
    * 3. Add the first candidates workers from the left and the last candidates workers from the right to the min-heap.
    * 4. For each of the k hiring sessions, do the following:
    *   a. Poll the worker with the lowest cost from the min-heap and add their cost to the total cost.
    *  b. If the polled worker was from the left side, add the next worker from the left to the min-heap (if any).
    * c. If the polled worker was from the right side, add the next worker from the right to the min-heap (if any).
    * 5. Return the total cost after k hiring sessions.
    *   
    * Time Complexity: O(k log candidates) where k is the number of hiring sessions and candidates is the number of workers considered from each side. Each insertion and removal from the heap takes O(log candidates).
    * Space Complexity: O(candidates) for the min-heap storing the workers' costs and indices.
    * 
*/

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a[0] == b[0])
                    return a[1] - b[1];

                return a[0] - b[0];
            }
        );

        int n = costs.length;
        int left = 0;
        int right = n - 1;

        for(int i = 0; i < candidates && left <= right; i++) {

            pq.offer(new int[]{costs[left], left});
            left++;
        }   

        for(int i = 0; i < candidates && left <= right; i++) {

            pq.offer(new int[]{costs[right], right});
            right--;
        }
        long ans = 0;

        while(k-- > 0) {

            int[] worker = pq.poll();
            ans += worker[0];
            int idx = worker[1];

            if(left <= right){

                if(idx < left) {
                    pq.offer(new int[]{costs[left], left});
                    left++;
                }
                else {
                    pq.offer(new int[]{costs[right], right});
                    right--;
                }
            } 
        }
        return ans;
    }
}