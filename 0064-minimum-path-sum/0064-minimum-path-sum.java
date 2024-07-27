class Solution {

    // //memoize
    // public int minPathSum(int[][] grid) {
    //     int m = grid.length;
    //     int n = grid[0].length;

    //     //declare dp array with row & col
    //     // initialise with -1
    //     int[][] dp = new int[m][n];

    //     for (int[] row : dp) Arrays.fill(row, -1);

    //     return solve(m - 1, n - 1, grid, dp);
    // }

    // private int solve(int i, int j, int[][] grid, int[][] dp) {
    //     if (i == 0 && j == 0) return grid[i][j];

    //     if (i < 0 || j < 0) return (int) 1e9; // return a huge value so that it doesn't consider as minimum.

    //     if (dp[i][j] != -1) return dp[i][j];

    //     int up = grid[i][j] + solve(i - 1, j, grid, dp);
    //     int left = grid[i][j] + solve(i, j - 1, grid, dp);

    //     return dp[i][j] = Math.min(up, left);
    // }
    // Now how to tabulation?
    // 1. check i & j from where to where it is going
    // that is 0 -> m-1 ans 0 -> n-1
    // add a for loop

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        //declare dp array with row & col
        // initialise with -1
        int[][] dp = new int[m][n];

        for (int[] row : dp) Arrays.fill(row, -1);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) dp[i][j] = grid[0][0]; else {
                    int up = grid[i][j];
                    int left = grid[i][j];
                    if (i > 0) up = grid[i][j] + dp[i - 1][j]; else up = (int) 1e9;
                    if (j > 0) left = grid[i][j] + dp[i][j - 1]; else left = (int) 1e9;
                    dp[i][j] = Math.min(up, left);
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
