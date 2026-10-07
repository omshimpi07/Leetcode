/*
1854. Maximum Population Year
You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
Return the earliest year with the maximum population.

Example 1: Input: logs = [[1993,1999],[2000,2010]] Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
Example 2: Input: logs = [[1950,1961],[1960,1971],[1970,1981]] Output: 1960
Explanation: The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
 
Diifficulty: Easy

Approach: Brute Force
1. Initialize maxCount to 0 and answer to 1950.
2. Iterate through each year from 1950 to 2049 (inclusive).
3. For each year, initialize a count variable to 0.
4. Iterate through each log in the logs array and check if the current year is within the birth and death range of that log. If it is, increment the count variable.
5. After checking all logs for the current year, compare the count with maxCount. If count is greater than maxCount, update maxCount and set answer to the current year.
6. After iterating through all years, return the answer which holds the earliest year with the maximum population.

Time Complexity: O(n * m), where n is the number of logs and m is the number of years (100 in this case).
Space Complexity: O(1), as we are using a constant amount of extra space.


*/

class Solution {
    public int maximumPopulation(int[][] logs) {
        

        // int maxCount = 0;
        // int answer = 1950;

        // for (int year = 1950; year < 2050; year++) {

        //     int count = 0;

        //     for (int i = 0; i < logs.length; i++) {

        //         if (logs[i][0] <= year && year < logs[i][1]) {
        //             count++;
        //         }
        //     }

        //     if (count > maxCount) {
        //         maxCount = count;
        //         answer = year;
        //     }
        // }

        // return answer;


        int[] population = new int[101];

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];

            population[birth - 1950]++;
            population[death - 1950]--;
        }

        int current = 0;
        int maxCount = 0;
        int answer = 1950;

        for (int i = 0; i < 101; i++) {

            current += population[i];

            if (current > maxCount) {
                maxCount = current;
                answer = 1950 + i;
            }
        }

        return answer;


    }
}