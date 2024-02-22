class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int column=grid[0].length;
        int visited[][]=new int[row][column];
        int numIslands=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(grid[i][j]=='1' && visited[i][j]==0)
                {
                    visited[i][j]=1;
                    bfs(grid,i,j,visited);
                    //printVisited(visited);
                    numIslands++;
                }
            }
        }
        
        return numIslands;
        
    }

    public void bfs(char[][] grid,int ro,int co,int[][] visited)
    {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(ro,co));
        int[][] direction={{-1,0},{1,0},{0,-1},{0,1}};

        while(!q.isEmpty())
        {
            int row=q.peek().first;
            int column=q.peek().second;
            q.remove();
            
            for(int[] direct:direction)
            {
                    int nRow=row+direct[0];
                    int nColumn=column+direct[1];
                    if(isValidIsland(nRow,nColumn,n,m,grid,visited))
                    {
                        visited[nRow][nColumn]=1;
                        q.add(new Pair(nRow,nColumn));
                    }
            }
        }


    }

    private boolean isValidIsland(int nRow,int nColumn,int n,int m,char[][] grid,int[][]visited)
    {
        if(nRow>=0 && nColumn >=0 && nRow < n && nColumn < m && grid[nRow][nColumn]=='1' && visited[nRow][nColumn]==0)
        {
            return true;
        }
        return false;
    }

    // private void printVisited(int[][] visited)
    // {
    //     int row=visited.length;
    //     int column=visited[0].length;
    //     for(int i=0;i<row;i++)
    //     {
    //         for(int j=0;j<column;j++)
    //         {
    //             System.out.print(visited[i][j]+" ");
    //         }
    //         System.out.println();
    //     }

    // }
}