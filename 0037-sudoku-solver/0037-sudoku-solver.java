class Solution {
    public void solveSudoku(char[][] board) {
        
        int n=board.length;
        int m=board[0].length;
        
        solve(board,n,m);
        
    }
    
    public boolean solve(char[][] board,int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char c='1';c<='9';c++)
                    {
                        if(isValid(board,i,j,c))
                        {
                            board[i][j]=c;
        
                            if(solve(board,n,m))
                                return true;
                            else{
                            board[i][j]='.';
                            }
                        }
                     }
                    return false;
                 }
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board,int n,int m,char c)
    {
        for(int i=0;i<9;i++)
        {
            if(board[i][m]==c)
            {
                return false;
            }
            if(board[n][i]==c)
            {
                return false;
            }
            if(board[3*(n/3)+(i/3)][3*(m/3)+(i%3)]==c)
            {
                return false;
            }
        }
        return  true;
    }
}