class Solution {
    class Pair{
        int row,column;
        Pair(int row, int column){
            this.row=row;
            this.column=column;
        }
    }
    private boolean[][] visited;
    private int m,n;
    private Queue<Pair> q;
    private int bfs(int countFresh, int[][] grid){
        int time=0;
        int[] deltaRow = {-1,0,0,1};
        int[] deltaColumn = {0,-1,1,0};
        while(!q.isEmpty() && countFresh>0){
            int length=q.size();
            for(int i=0; i<length; i++){
                int row=q.peek().row, column=q.peek().column;
                q.remove();
                for(int j=0; j<4; j++){
                    int neighbourRow= row + deltaRow[j];
                    int neighbourColumn = column + deltaColumn[j];
                    if(neighbourRow>=0 && neighbourRow<m && neighbourColumn>=0 && neighbourColumn<n
                                && grid[neighbourRow][neighbourColumn]==1 && !visited[neighbourRow][neighbourColumn]){
                        q.add(new Pair(neighbourRow, neighbourColumn));
                        visited[neighbourRow][neighbourColumn]=true;
                        countFresh--;
                    }
                }
            }
            time++;
        }
        return countFresh>0 ? -1:time;
    }

    public int orangesRotting(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int countFresh=0;
        visited = new boolean[m][n];
        q = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i, j));
                    visited[i][j]=true;
                }
                else if(grid[i][j]==1) countFresh++;
            }
        }
        return bfs(countFresh, grid);
    }
}