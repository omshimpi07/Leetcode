/*
118. Pascal's Triangle

You are given an integer numRows.
Return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it and the first and last number on each row must be equal to 1, as shown below:

Example 1: Input: numRows = 5 Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

DIfficulty : Easy

Operation	Meaning
row.add(1)	Add 1 to the current row
row.add(left + right)	Add the sum
triangle.add(row)	Add the completed row to the triangle
triangle.get(i)	Access row i
triangle.get(i).get(j)	Access element j of row i

*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {

                int left = triangle.get(i - 1).get(j - 1);
                int right = triangle.get(i - 1).get(j);

                row.add(left + right);
            }

            if (i > 0) {
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;



    }
}

