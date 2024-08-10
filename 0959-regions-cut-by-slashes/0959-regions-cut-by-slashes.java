class Solution {
    public int regionsBySlashes(String[] grid) {

        int row = grid.length;
        int col = grid[0].length();

        int[][] matrix = new int[row * 3][col * 3];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                int baseRow = i * 3;
                int baseCol = j * 3;
                // [0,2]  [1,1] [2,0]
                // 0 0 1
                // 0 1 0
                // 1 0 0
                if(grid[i].charAt(j) == '/')
                {
                    matrix[baseRow][baseCol + 2] = 1;
                    matrix[baseRow + 1][baseCol + 1] = 1;
                    matrix[baseRow + 2][baseCol] = 1;
                }
                // [0,0]  [1,1] [2,2]
                // 1 0 0
                // 0 1 0
                // 0 0 1
                else if(grid[i].charAt(j) == '\\')
                {
                    matrix[baseRow][baseCol] = 1;
                    matrix[baseRow + 1][baseCol + 1] = 1;
                    matrix[baseRow + 2][baseCol + 2] = 1;
                }
            }
        }

        int regions = 0;
        for(int i = 0; i < row * 3; i++)
        {
            for(int j = 0; j < col *3; j++)
            {
                if( matrix[i][j] == 0)
                {
                    floodFill(matrix, i , j);  // Peform DFS or BFS similar to number of islands problem.
                    regions++;
                }
            }
        }
      return regions;  
    }

    private void floodFill(int[][] matrix, int i, int j)
    {
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 1)
        {
            return;
        }

        //First mark it as 1.
        matrix[i][j] = 1;

        //Traverse all the 4 directions
        floodFill(matrix, i - 1, j);  // top
        floodFill(matrix, i + 1, j);  // down
        floodFill(matrix, i, j + 1);  // right
        floodFill(matrix, i, j - 1);  //left
    }
}