class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> spiralOrder = new ArrayList<>();
        int top = 0;
        int down = m - 1;
        int left = 0;
        int right = n - 1;
        int[][] visited = new int[m][n];
        while( (top <= down) && (left <= right) )
        {
            for(int i = left; i <= right; i++)
            {
                if(visited[top][i] == 0)
                {
                    spiralOrder.add(matrix[top][i]);
                    visited[top][i] = 1;
                }
                
            }
            top++;

            for(int i = top; i <= down; i++)
            {
                if(visited[i][right] == 0)
                {
                    spiralOrder.add(matrix[i][right]);
                    visited[i][right] = 1;
                }
                
            }
            right--;

            for(int i = right; i >= left; i--)
            {
                if(visited[down][i] == 0)
                {
                    spiralOrder.add(matrix[down][i]);
                    visited[down][i] = 1;
                }
            }
            down--;

            for(int i = down; i >= top; i--)
            {
                if(visited[i][left] == 0)
                {
                    spiralOrder.add(matrix[i][left]);
                    visited[i][left] = 1;
                }
            }
            left++;

            
        }

        return spiralOrder;
        
    }
}