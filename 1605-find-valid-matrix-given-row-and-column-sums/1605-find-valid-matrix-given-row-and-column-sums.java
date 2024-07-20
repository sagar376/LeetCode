class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {

        int[][] grid = new int[rowSum.length][colSum.length];
        int i=0;
        int j=0;


        while(i < rowSum.length && j < colSum.length)
        {
            grid[i][j]= Math.min(rowSum[i],colSum[j]);
            rowSum[i] -=grid[i][j];
            colSum[j] -=grid[i][j];

            if(rowSum[i] ==0 )
            {
                i++;
            }
            else
            {
                j++;
            }
        }

        return grid;
        
    }
}