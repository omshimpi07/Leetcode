/*
3731. Find Missing Elements

You are given an integer array nums consisting of unique integers.
Originally, nums contained every integer within a certain range. However, some integers might have gone missing from the array.
The smallest and largest integers of the original range are still present in nums.
Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.

Example 1: Input: nums = [1,4,2,5] Output: [3]
Explanation: The smallest integer is 1 and the largest is 5, so the full range should be [1,2,3,4,5]. Among these, only 3 is missing.

Example 2: Input: nums = [7,8,6,9] Output: []
Explanation: The smallest integer is 6 and the largest is 9, so the full range is [6,7,8,9]. All integers are already present, so no integer is missing.

Constraints:

2 <= nums.length <= 100
1 <= nums[i] <= 100

Difficulty : easy

Approach : HashSet.
1. Create a HashSet to store the elements of the input array nums for O(1) lookup.
2. Find the minimum and maximum values in the nums array to determine the range of integers that
    should be present.
3. Iterate through the range from min to max, and for each integer, check if it is present in the HashSet.
4. If an integer is not present in the HashSet, add it to the result list
5. Return the result list containing all the missing integers in sorted order.

Time Complexity: O(n) where n is the length of the input array nums, since we iterate through the array to populate the HashSet and then iterate through the range from min to max.
Space Complexity: O(n) for the HashSet storing the elements of nums and the result list storing the missing integers.

*/

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length;i++){

            if(nums[i] < smallest){
                smallest = nums[i];
            }
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        List<Integer> listm = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = smallest; i <= largest; i++) {
            if (!set.contains(i)) {
            listm.add(i);
            }
        }
        return listm;

    }
}