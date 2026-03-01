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
        int answer = nums[0];
        int freq = 0;
        for(int i = 0; i <n;i++){
            
            if(freq == 0){
                answer = nums[i];
            }
            if(nums[i] ==answer){
                freq++;
            }
            else{
                freq--;
                
            }
        }
            return answer;
    }
};





