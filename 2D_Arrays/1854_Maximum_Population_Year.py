"""
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

Approach:
1. Create a list of size 101 to store the population change for each year from
    1950 to 2050.
2. Iterate through the logs and for each birth year, increment the population change at that index, and for each death year, decrement the population change at that index.
3. Iterate through the population change list and keep track of the current population and the maximum population
4. If the current population exceeds the maximum population, update the maximum population and the corresponding year.
5. Return the earliest year with the maximum population.

The time complexity of this approach is O(n) where n is the number of logs, and the space complexity is O(1) since we are using a fixed-size list of size 101.
Space complexity is O(1) because we are using a fixed-size list of size 101 to store the population change for each year from 1950 to 2050.

"""

class Solution:
    def maximumPopulation(self, logs: list[list[int]]) -> int:
        # max_count = 0
        # answer = 1950

        # for year in range(1950, 2050):

        #     count = 0

        #     for i in range(len(logs)):

        #         if logs[i][0] <= year and year < logs[i][1]:
        #             count += 1

        #     if count > max_count:
        #         max_count = count
        #         answer = year

        # return answer

        population = [0] * 101

        for birth, death in logs:
            population[birth - 1950] += 1
            population[death - 1950] -= 1

        current = 0
        max_count = 0
        answer = 1950

        for i in range(101):

            current += population[i]

            if current > max_count:
                max_count = current
                answer = 1950 + i
        return answer