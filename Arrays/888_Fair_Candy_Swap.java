/*
888. Fair Candy Swap
Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.
Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.

Example 1: Input: A = [1,1], B = [2,2] Output: [1,2]

Example 2: Input: A = [1,2], B = [2,3] Output: [1,2]

Example 3: Input: A = [2], B = [1,3] Output: [2,3]

Example 4: Input: A = [1,2,5], B = [2,4] Output: [5,4]

Difficulty: Easy

Approach:
1. Calculate the sum of Alice's candy bars (suma) and the sum of Bob's candy bars (sumb).
2. Calculate the difference (diff) between the two sums, which is (suma -
sumb) / 2. This represents the amount that Alice needs to give to Bob to equalize their totals.
3. Iterate through each candy bar size in Alice's array and for each size, check if
there is a corresponding candy bar size in Bob's array that would equalize their totals when exchanged.
4. If such a pair is found, return the sizes of the candy bars to be exchanged.
Time Complexity: O(n*m) where n is the length of Alice's array and m is the length of Bob's array.
Space Complexity: O(1)

 */


class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int suma = 0;
        int sumb = 0;
        int diff = 0;

        for(int j = 0; j < bobSizes.length;j++){
            sumb += bobSizes[j];
        }

        for(int i = 0; i < aliceSizes.length;i++){
            suma += aliceSizes[i];
        }

        diff = (suma - sumb)/2;

        for(int i = 0 ; i<aliceSizes.length;i++){

            for(int j = 0;j<bobSizes.length;j++){
                if(aliceSizes[i] - bobSizes[j] == diff){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[]{};
    }
    
}