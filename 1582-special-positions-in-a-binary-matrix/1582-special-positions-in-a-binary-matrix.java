class Solution {
    public int numSpecial(int[][] mat) {
        int rowCount=0;
        int colCount=0;
        int special=0;
        for(int row=0;row<mat.length;row++)
        {
            for(int col=0;col<mat[0].length;col++)
            {
                if(mat[row][col]==1)
                {
                    for(int i=0;i<mat.length;i++)
                    {
                        if(mat[i][col]==1 && i!=row)
                        {
                            rowCount++;
                        }
                    }
                    for(int j=0;j<mat[0].length;j++)
                    {
                        if(mat[row][j]==1 && j!=col)
                        {
                            colCount++;
                        }
                    }
                    if(rowCount==0 && colCount==0)
                    {
                        special++;
                    }
                    rowCount=0;colCount=0;
                }
            }
        }
        return special;
        
    }
}