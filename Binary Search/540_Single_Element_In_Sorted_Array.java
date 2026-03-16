/*
540. Single Element in a Sorted Array
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.
Example 1: Input: nums = [1,1,2,3,3,4,4,8,8] Output: 2
Example 2: Input: nums = [3,3,7,7,10,11,11] Output: 10
Constraints:
1 <= nums.length <= 10^5
0 <= nums[i] <= 10^5
Difficulty: Medium
Approach:
1. Use binary search to find the single element in the sorted array.
2. Check the middle element and its neighbors to determine if it is the single element.
3. If the middle element is equal to its left neighbor, then the single element must be in the right half of the array. If it is equal to its right neighbor, then the single element must be in the left half of the array.
4. Continue the binary search until the single element is found.
Time Complexity: O(log n)
Space Complexity: O(1)

*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
            int n = nums.length;
            int low = 2;
            int high = n-3;
            
            if(nums.length == 1){
                return nums[0];
            }
            if(nums[0] != nums[1]){
                return nums[0];
            }

            if(nums[n-1] != nums[n-2]){
                return nums[n-1];
            }

            while(low <= high){
            
            int mid = (low + high)/2;
        
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            if(nums[mid] == nums[mid-1]){
                mid--;
            }

            if(mid % 2 == 0){
                    
                low = mid + 2;
            }else{
                high = mid - 1;
            }
            
        }
            
        return -1;
    }
}