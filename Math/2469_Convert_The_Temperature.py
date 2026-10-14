"""
2469. Convert the Temperature

You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
Return the array ans. Answers within 10-5 of the actual answer will be accepted.

Example 1: Input: celsius = 36.50
Output: [309.65000,97.70000]
Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

Difficulty: Easy

Approach:
1. To convert Celsius to Kelvin, we can use the formula: kelvin = celsius
    + 273.15
2. To convert Celsius to Fahrenheit, we can use the formula: fahrenheit = celsius * 1.80 + 32.00
3. Return the result as a list containing the converted values in the order of [kelvin, fahrenheit].
4. The function takes a float input representing the temperature in Celsius and returns a list of floats representing the temperature in Kelvin and Fahrenheit.
5. The function is defined within a class named Solution, and the method is named convertTemperature.
6. The function is expected to handle non-negative floating point numbers rounded to two decimal places as input.

TIME COMPLEXITY: O(1) - The function performs a constant number of arithmetic operations regardless of the input value.
SPACE COMPLEXITY: O(1) - The function uses a constant amount of space for the output list, regardless of the input value.

"""
class Solution:
    def convertTemperature(self, celsius: float) -> list[float]:
        kelvin = celsius + 273.15
        fahrenheit = celsius * 1.80 + 32.00

        return [kelvin, fahrenheit]