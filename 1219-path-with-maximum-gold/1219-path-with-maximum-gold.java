class Solution {

    int[][] directions={{0,-1},{0,1},{-1,0},{1,0}};
    public int getMaximumGold(int[][] grid) {

        int maxGold=0;

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0)
                {
                    maxGold=Math.max(maxGold,DFS(i,j,grid));
                }
            }
        }
        return maxGold;
        
    }
    private int DFS(int i,int j,int[][] grid)
    {
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]==0)
        {
            return 0;
        }

        int originalValue=grid[i][j];
        grid[i][j]=0;

        int maxGold=0;

        for(int[] dir : directions)
        {
            int new_i=i+dir[0];
            int new_j=j+dir[1];

            maxGold=Math.max(maxGold,DFS(new_i,new_j,grid));

        }

        grid[i][j]=originalValue;
        return maxGold+originalValue;
    }
}