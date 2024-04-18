// class Solution {
//     public int islandPerimeter(int[][] grid) {

// // \U0001f50d Methods To Solve This Problem:
// // I'll be covering two different methods to solve this problem:

// // 1.Iterative Approach with Counting Borders
// // 2.Depth-First Search (DFS)

//         int col=grid[0].length;
//         int row=grid.length;
//         int perimeter=0;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 if(grid[i][j]==1)
//                 {
//                     perimeter+=4;

//                     if(i>0 && grid[i-1][j] == 1)
//                     {
//                         perimeter-=2;
//                     }
//                     if(j>0 && grid[i][j-1] == 1)
//                     {
//                         perimeter-=2;
//                     }
//                 }
//             }
//         }
//         return perimeter;
        
//     }
// }

class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    perimeter += dfs(grid, r, c);
                }
            }
        }

        return perimeter;
    }

    private int dfs(int[][] grid, int r, int c) {
        // Base cases for DFS recursion
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 1; // Water contributes 1 to perimeter
        }
        if (grid[r][c] == -1) {
            return 0; // Already visited land cell
        }

        // Mark cell as visited
        grid[r][c] = -1;

        // Explore neighbors (up, down, left, right)
        return (dfs(grid, r + 1, c) +
                dfs(grid, r - 1, c) +
                dfs(grid, r, c + 1) +
                dfs(grid, r, c - 1));
    }
}