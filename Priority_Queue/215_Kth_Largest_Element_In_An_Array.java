/*
215. Kth Largest Element in an Array

Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
You must solve it in O(n) time complexity.

Example 1: Input: nums = [3,2,1,5,6,4], k = 2 Output: 5
Example 2: Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 Output: 4

Difficulty : medium

Approach : Priority Queue (Min Heap).
1. Use a min-heap (priority queue) to keep track of the k largest elements
2. Iterate through the elements of the array, adding each element to the min-heap.
3. If the size of the min-heap exceeds k, remove the smallest element (the root of the min-heap).
4. After processing all elements, the root of the min-heap will be the kth largest element in the array.

Time Complexity: O(n log k) where n is the number of elements in the array, since each insertion and deletion operation in the heap takes O(log k) time.
Space Complexity: O(k) for the min-heap storing the k largest elements.

*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Arrays.sort(nums);
        // return nums[nums.length - k];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums) {

            pq.offer(num);

            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();

    }
}