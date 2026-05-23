class Solution {
    public int equalPairs(int[][] grid) {

        int count = 0;

        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i<grid.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<grid.length;j++){
                sb.append(grid[i][j]).append(",");
            }
            String key = sb.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
            
        }
        for(int i = 0; i<grid.length;i++){
            StringBuilder sb1 = new StringBuilder();
            for(int j = 0; j<grid.length;j++){
                sb1.append(grid[j][i]).append(",");
            }
            String key = sb1.toString();
            count += map.getOrDefault(key, 0);
        }
        return count;
    }
}

// class Solution {
//     public int equalPairs(int[][] grid) {

//         int count = 0;

//         HashMap<List<Integer>,Integer> map = new HashMap<>();

//         for(int i = 0; i<grid.length;i++){
//             List<Integer> row = new ArrayList<>();
//             for(int j = 0; j<grid.length;j++){
//                 row.add(grid[i][j]);
//             }
            
//             map.put(row, map.getOrDefault(row, 0) + 1);
            
//         }
//         for(int i = 0; i<grid.length;i++){
//             List<Integer> col = new ArrayList<>();
//             for(int j = 0; j<grid.length;j++){
//                 col.add(grid[j][i]);
//             }
            
//             count += map.getOrDefault(col, 0);
//         }
//         return count;
//     }
// }