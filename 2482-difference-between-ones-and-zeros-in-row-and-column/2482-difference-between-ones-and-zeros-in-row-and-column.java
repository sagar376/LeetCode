class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
      int m= grid.length;
      int n=grid[0].length;
      int[] rowOnes=new int[m];
      int[] colOnes=new int[n];

      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(grid[i][j]==1)
          {
            rowOnes[i]++;
            colOnes[j]++;
          }
        }
      }

      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          grid[i][j]=2*(rowOnes[i]+colOnes[j])-m-n;
        }
      }
      return grid;
        
    }
}