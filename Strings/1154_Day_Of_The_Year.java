/*
1154. Day of the Year
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

Example 2:

Input: date = "2019-02-10"
Output: 41

Difficulty : Easy;4
*/

class Solution {
    public int dayOfYear(String date) {
        
        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            days[1] = 29;
        }

        int sum = 0;

        for(int i = 0; i < month - 1; i++) {
            sum += days[i];
        }
        sum += day;
        return sum;
    }
}