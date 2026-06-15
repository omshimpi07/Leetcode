/*

399. Evaluate Division
You are given an array of variable pairs equations and an array of real numbers values, where equations[i] = [Ai, Bi] and values[i] represent the equation Ai / Bi = values[i]. Each Ai or Bi is a string that represents a single variable.
You are also given some queries, where queries[j] = [Cj, Dj] represents the jth query where you must find the answer for Cj / Dj = ?.
Return the answers to all queries. If a single answer cannot be determined, return -1.0.

Example 1: Input: equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]] Output: [6.00000,0.50000,-1.00000,1.00000,-1.00000] Explanation: Given: a / b = 2.0, b / c = 3.0 We can calculate the following: a / c = (a / b) * (b / c) = 2.0 * 3.0 = 6.0 b / a = 1 / (a / b) = 1 / 2.0 = 0.5 a / e = -1.0 (e does not exist) a / a = 1.0 x / x = -1.0 (x does not exist)
Example 2: Input: equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]] Output: [3.75000,0.40000,5.00000,0.20000]
Example 3: Input: equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]] Output: [0.50000,2.00000,-1.00000,-1.00000]

Constraints:
1 <= equations.length <= 20
equations[i].length == 2
1 <= Ai.length, Bi.length <= 5
values.length == equations.length
0.0 < values[i] <= 20.0
1 <= queries.length <= 20
queries[j].length == 2
1 <= Cj.length, Dj.length <= 5
Ai, Bi, Cj, Dj consist of lower case English letters and digits.

Difficulty : medium

Approach : Depth First Search (DFS).
1. We can represent the equations as a graph, where each variable is a node and the division relationships are directed edges with weights corresponding to the division values.
2. For each query, we can perform a depth-first search (DFS) from the start variable to the target variable, multiplying the edge weights along the path. If we reach the target variable, we return the product of the weights. If we exhaust all paths without finding the target variable, we return -1.0.

Time Complexity: O(E + Q * V) where E is the number of equations (edges), Q is the number of queries, and V is the number of variables (nodes). In the worst case, we may visit all nodes for each query.
Space Complexity: O(V + E) for the graph representation and the recursion stack in the worst case.
*/

class Solution {

    class Edge {

        String neighbor;
        double weight;

        Edge(String neighbor, double weight) {
            this.neighbor = neighbor;
            this.weight = weight;
        }
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        double[] answer = new double[queries.size()];
        Map<String, List<Edge>> graph = new HashMap<>();

        for(int i = 0; i < equations.size(); i++) {

            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);

            double value = values[i];

            graph.putIfAbsent(a, new ArrayList<>());
            graph.putIfAbsent(b, new ArrayList<>());

            graph.get(a).add( new Edge(b, value));
            
            graph.get(b).add( new Edge(a, 1.0 / value));
        }

        for(int i = 0; i < queries.size(); i++) {

            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);

            if(!graph.containsKey(start) || !graph.containsKey(end)) {

                answer[i] = -1.0;
                continue;
            }

            Set<String> visited = new HashSet<>();

            answer[i] = dfs( start, end, 1.0, visited, graph );
        }
        return answer;

    }
    
    private double dfs(String current, String target, double product, Set<String> visited,
        Map<String,List<Edge>> graph) {

    if(current.equals(target)){
        return product;
    }
    visited.add(current);

    for(Edge edge : graph.getOrDefault(current,new ArrayList<>())) {
        
        // for(int i=0;i<graph.get(current).size();i++) {

        //     Edge edge = graph.get(current).get(i);
        // }

        if(!visited.contains(edge.neighbor)) {

            double result = dfs(edge.neighbor, target, product * edge.weight, visited, graph);

            if(result != -1.0){
                return result;
            }
        }
    }
    return -1.0;
}


}