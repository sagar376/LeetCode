class Solution {

    //memoize
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        //declare dp array with row & col
        // initialise with -1
        int[][] dp = new int[m][n];

        for(int[] row:dp)
        Arrays.fill(row, -1);

        return solve(m - 1, n - 1, grid, dp);
    }

    private int solve(int i, int j, int[][] grid, int[][] dp) {
        if (i == 0 && j == 0) return grid[i][j];

        if (i < 0 || j < 0) return (int) 1e9;

        if (dp[i][j] != -1) return dp[i][j];

        int up = grid[i][j] + solve(i - 1, j, grid, dp);
        int left = grid[i][j] + solve(i, j - 1, grid, dp);

        return dp[i][j] = Math.min(up, left);
    }
}
