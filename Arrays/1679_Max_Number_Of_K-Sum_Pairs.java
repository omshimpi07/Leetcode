/*
1679. Max Number of K-Sum Pairs
Given an integer array nums and an integer k, return the maximum number of operations you can perform on the array to make all its elements equal to zero.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Example 1:
Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:
Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.

Difficulty : medium
Approach:
1. Sort the input array and use two pointers, one starting at the beginning of the array (left) and the other at the end of the array (right).
2. Calculate the sum of the elements at the left and right pointers. If the sum equals k, increment the count of operations and move both pointers towards the center. If the sum is less than k, move the left pointer to the right to increase the sum. If the sum is greater than k, move the right pointer to the left to decrease the sum.
Time Complexity: O(n log n) due to the sorting step, where n is the length of the input array.
Space Complexity: O(1) if we ignore the space used for sorting, otherwise O(n) due to the sorting algorithm's space complexity.
2. Alternatively, we can use a HashMap to count the frequency of each number in the input array. For each number, we check if the complement (k - current number) exists in the HashMap. If it does, we can form a pair and increment the count of operations, while also decrementing the frequency of the complement in the HashMap. If it doesn't exist, we add the current number to the HashMap with its frequency.
Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(n) for the HashMap that stores the frequency of each number in the input array.
*/




class Solution {
    public int maxOperations(int[] nums, int k) {
        
        int left = 0;
        int right =  nums.length - 1;
        int output = 0;
        Arrays.sort(nums);
        while(left < right){

            if(nums[left] + nums[right] == k){
                output++;
                left++;
                right--;
            }
            else if(nums[left] + nums[right] < k){
                left++;
            }
            else{
                right--;
            }
            
        }
        return output;
    }
}

class Solution {
    public int maxOperations(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i<nums.length;i++){
            int need = k - nums[i];
            int num = nums[i];
            if(map.getOrDefault(need, 0) > 0){
                count++;
                map.put(need, map.get(need) - 1);
            }
            else {
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        return count;
    }
}