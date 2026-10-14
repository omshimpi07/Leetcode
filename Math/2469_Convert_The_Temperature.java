/*
2469. Convert the Temperature

You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
Return the array ans. Answers within 10-5 of the actual answer will be accepted.

Example 1: Input: celsius = 36.50
Output: [309.65000,97.70000]
Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

Difficulty: Easy

Approach:
1. To convert Celsius to Kelvin, use the formula: Kelvin = Celsius + 273.15.
2. To convert Celsius to Fahrenheit, use the formula: Fahrenheit = Celsius * 1.80 + 32.00.
3. Create an array to store the results and return it.

Time Complexity: O(1) - The solution runs in constant time as it only involves a few arithmetic operations.
Space Complexity: O(1) - The solution uses a constant amount of space regardless of the

*/

class Solution {
    public double[] convertTemperature(double celsius) {
        
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;

        double[] arr = new double[2];
        arr[0] = Kelvin;
        arr[1] = Fahrenheit;

        return arr;

    }
}