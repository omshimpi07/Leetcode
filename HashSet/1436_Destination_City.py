"""
1436.Destination City
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city. It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city. 

Example 1: Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]] Output: "Sao Paulo" Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Difficulty : easy

Approach:
1. Create a set to store all source cities.
2. Iterate through the paths and add each source city to the set.
3. Iterate through the paths again and check if the destination city is not in the set of source cities.
4. Return the destination city that is not in the set of source cities.

Time Complexity: O(n), where n is the number of paths.
Space Complexity: O(n), where n is the number of unique cities in the paths.

"""

class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        sources = set()

        # Store all source cities
        for path in paths:
            sources.add(path[0])

        # Check every destination
        for path in paths:
            destination = path[1]

            if destination not in sources:
                return destination

        return ""