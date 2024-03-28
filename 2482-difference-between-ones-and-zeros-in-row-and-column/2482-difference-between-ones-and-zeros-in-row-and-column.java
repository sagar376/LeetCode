class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int[] onesRow=new int[grid.length];
        int[] onesCol=new int[grid[0].length];

        int index=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                onesRow[i]+=grid[i][j];
                onesCol[j]+=grid[i][j];
            }
        }

        int[][] diff=grid;
        for(int i=0;i<diff.length;i++)
        {
            for(int j=0;j<diff[0].length;j++)
            {
                diff[i][j]=onesRow[i]+onesCol[j]-(grid.length-onesRow[i])-(grid[0].length-onesCol[j]);
            }
        }
        
    return diff;
        
    }
}