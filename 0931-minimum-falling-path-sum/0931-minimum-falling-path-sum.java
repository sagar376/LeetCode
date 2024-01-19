class Solution {
    public int minFallingPathSum(int[][] matrix) {
      int rowSize=matrix.length;
      int colSize=matrix[0].length;

      for(int i=1;i<rowSize;i++)
      {
        for(int j=0;j<colSize;j++)
        {
          matrix[i][j]+=Math.min(matrix[i-1][j],Math.min(matrix[i-1][Math.max(0,j-1)],matrix[i-1][Math.min(colSize-1,j+1)]));
        }
      }
      return Arrays.stream(matrix[matrix.length-1]).min().getAsInt();



        //int size=matrix.size();
    //     int rowSize=matrix.length;
    //     int colSize=matrix[0].length;
    //     int[] minpath=new int[2];
    //     int ans=0;

    //     for(int i=0;i<rowSize;i++)
    //     {
    //       if(i==0)
    //       minpath=findmin(matrix,i,0,colSize-1);
    //       else{
    //       if(minpath[1]==0)
    //       minpath=findmin(matrix,i,minpath[1],minpath[1]+1);
    //       else if(minpath[1]==colSize-1)
    //       minpath=findmin(matrix,i,minpath[1]-1,minpath[1]);
    //       else
    //       minpath=findmin(matrix,i,minpath[1]-1,minpath[1]+1);
    //       }
    //       System.out.print(minpath[0]+" "+minpath[1]);
    //       System.out.println();
    //       ans+=minpath[0];
    //     }
    //     return ans;
    // }
    // public int[] findmin(int matrix[][],int row,int start,int end)
    // {
    //   int min[]=new int[2];
    //   min[0]=Integer.MAX_VALUE;

    //   for(int i=start;i<=end;i++)
    //   {
    //     // System.out.println(matrix[row][i]);
    //     if(min[0]>matrix[row][i])
    //     {
    //       min[0]=matrix[row][i];
    //       min[1]=i;
    //     }
    //   }
    //   return min;
    }
}