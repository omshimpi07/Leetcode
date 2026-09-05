/*
1436.Destination City
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city. It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city. 

Example 1: Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]] Output: "Sao Paulo" Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

Difficulty : easy

Approach : HashSet.
1. Create a HashSet to store all source cities.
2. Iterate through the paths and add each source city (the first element of each path) to the HashSet.
3. Iterate through the paths again and check if the destination city (the second element of each path) is not present in the HashSet of source cities.
4. The first destination city that is not found in the HashSet is the final destination city. Return it.
Time Complexity: O(n) where n is the number of paths, since we iterate through the paths twice.
Space Complexity: O(n) for storing the source cities in the HashSet.   

*/

class Solution {
    public String destCity(List<List<String>> paths) {
        
        // for (int i = 0; i < paths.size(); i++) {

        //     String destination = paths.get(i).get(1);
        //     boolean found = false;

        //     // Check if this destination appears as a source
        //     for (int j = 0; j < paths.size(); j++) {

        //         if (destination.equals(paths.get(j).get(0))) {
        //             found = true;
        //             break;
        //         }
        //     }

        //     // Destination never appears as a source
        //     if (!found)
        //         return destination;
        // }

        // return "";

        HashSet<String> sources = new HashSet<>();

        // Store all source cities
        for (int i = 0; i < paths.size(); i++) {
            sources.add(paths.get(i).get(0));
        }

        // Check every destination
        for (int i = 0; i < paths.size(); i++) {
            String destination = paths.get(i).get(1);

            if (!sources.contains(destination)) {
                return destination;
            }
        }

        return "";

    }
}