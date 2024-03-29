class Solution {
    public int cherryPickup(int[][] grid) {
        /// try to solve using other methods tabulation,top down 
// link : https://www.youtube.com/watch?v=QGfn7JeXK54
        int n=grid.length;
        int m=grid[0].length;
        
        int dp[][][]=new int[n][m][m];
        for(int[][] row:dp)
        {
            for(int[] innerRow: row){
                Arrays.fill(innerRow,-1);
            }
        }
        
        return solve(grid,dp,0,0,m-1);
        
        
    }
    
    public int solve(int[][] grid,int[][][] dp,int i,int j1,int j2)
    {
        int maxi=0;
        if(j1<0 || j1>=grid[0].length || j2<0 || j2>=grid[0].length)
        {
            return -2;
        }
        if(i==grid.length-1)
        {
            if(j1==j2)
            return grid[i][j1];
            else
            return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=-1)return dp[i][j1][j2];
        
                for(int dj1=-1;dj1<=1;dj1++)
                {
                    for(int dj2=-1;dj2<=1;dj2++)
                    {
                        int value=0;
                        if(j1==j2)
                        value=grid[i][j1];
                        else
                        value=grid[i][j1]+grid[i][j2];

                        value+=solve(grid,dp,i+1,j1+dj1,j2+dj2);
                        maxi=Math.max(value,maxi);
                    }
                }
            
        
        return dp[i][j1][j2]=maxi;
    }   
}