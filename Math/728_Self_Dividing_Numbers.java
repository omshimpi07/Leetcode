/*
728. Self Dividing Numbers

A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.
Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right] (both inclusive).

Example 1: Input: left = 1, right = 22 Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
Example 2: Input: left = 47, right = 85 Output: [48,55,66,77]
 
Diificulty : easy

Appraoch : Math.
1. Iterate through each number in the range from left to right.
2. For each number, check if it is a self-dividing number by examining each digit
    a. If any digit is 0 or the number is not divisible by that digit, it is not a self-dividing number.
    b. If all digits divide the number evenly, it is a self-dividing number.
3. Collect all self-dividing numbers in a list and return it.

Time Complexity: O(n * d) where n is the number of integers in the range [left, right] and d is the average number of digits in those integers.
Space Complexity: O(k) where k is the number of self-dividing numbers found in the range, as we store them in a list.

*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        // ArrayList<Integer> list1 = new ArrayList<>();

        // int count = 0;
        // int nummer = left;
        // int temp = nummer;

        // int length = 0;
        // int temp2 = temp;
        
        // while(nummer <= right){
        //     length = 0;
        //     while(temp2 > 0){
        //         length++;
        //         temp2 /= 10;
        //     }

        //     while(temp > 0){

        //         int lastdigit = temp % 10;
        //         if (lastdigit == 0) {
        //             break;
        //         }

        //         if(nummer % lastdigit == 0){
        //             count++; 
        //         }
        //         temp /= 10;
 
        //     }

        //     if(length == count ){
        //         list1.add(nummer);
        //     }
        //     count = 0;
        //     nummer++;
        //     temp = nummer;
        //     temp2 = temp;
        // }
        // return list1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int number = left; number <= right; number++) {

            int temp = number;
            boolean valid = true;

            while (temp > 0) {

                int digit = temp % 10;

                if (digit == 0 || number % digit != 0) {
                    valid = false;
                    break;
                }

                temp /= 10;
            }

            if (valid) {
                list.add(number);
            }
        }

        return list;
    }
}

