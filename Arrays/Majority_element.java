//
// Problem: 169. Majority Element
// Link: https://leetcode.com/problems/majority-element/
// Difficulty: Easy

// Approach:
// - Moore's Voting Algorithm

// Time Complexity: O(n)
// Space Complexity: O(1)
// 

class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int answer = 0;
        int freq = 0;
        for(int i = 1; i <n;i++){
            
            if(nums[i] == 0){
                answer = 0;
            }
            if(answer == nums[i]){
                freq++;
            }
            else{
                freq--;
                answer = nums[i];
            }
        }
            return answer;
    }
};


