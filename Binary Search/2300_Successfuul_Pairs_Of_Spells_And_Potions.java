/*
2300. Successful Pairs of Spells and Potions
You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
A spell and potion pair is considered successful if the product of their strengths is at least success. More formally, the ith spell and jth potion pair is successful if spells[i] * potions[j] >= success.
Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.

Example 1: Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7 Output: [4,0,3]
Explanation:
- 0th spell: 5 * 1 = 5 < 7, 5 * 2 = 10 >= 7, 5 * 3 = 15 >= 7, 5 * 4 = 20 >= 7, 5 * 5 = 25 >= 7. Total successful pairs = 4.
- 1st spell: 1 * 1 = 1 < 7, 1 * 2 = 2 < 7, 1 * 3 = 3 < 7, 1 * 4 = 4 < 7, 1 * 5 = 5 < 7. Total successful pairs = 0.
- 2nd spell: 3 * 1 = 3 < 7, 3 * 2 = 6 < 7, 3 * 3 = 9 >= 7, 3 * 4 = 12 >= 7, 3 * 5 = 15 >= 7. Total successful pairs = 3.

Difficulty : medium

Approach : Binary Search.
1. Sort the potions array.
2. For each spell, use binary search to find the first potion that forms a successful pair with the spell.
3. The number of successful pairs for that spell will be the total number of potions minus the index of the first successful potion found.
4. Return the result array containing the counts of successful pairs for each spell.

Time Complexity: O(n log m) where n is the number of spells and m is the number of potions, since we perform a binary search for each spell. 
Space Complexity: O(1) if we ignore the space used for the output array, otherwise O(n) for the output array.
*/

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n = spells.length;
        int[] result = new int[n];
        int m = potions.length;
        
        Arrays.sort(potions);
        for(int i = 0; i<n ; i++){

            int left = 0;
            int right = m-1;
            int answer = m;

            while(left <= right){

                int mid = left + (right - left) / 2;
                long product = (long)spells[i] * potions[mid];
                if(product >= success){
                    answer = mid;
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            result[i] = m - answer;
        }
        return result;

        
    }
}
