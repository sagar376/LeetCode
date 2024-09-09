class Solution {
    public int[][] generateMatrix(int n) {

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int[][] result = new int[n][n];
        int index = 1;

        while((top <= bottom) && (left <= right))
        {
            for(int i = left; i <= right; i++)
            {
                result[top][i] = index++;
            }
            top++;

            for(int i = top; i <= bottom; i++)
            {
                result[i][right] = index++;
            }
            right--;

            for(int i = right; i >= left; i--)
            {
                result[bottom][i] = index++;
            }
            bottom--;

            for(int i = bottom; i >= top; i--)
            {
                result[i][left] = index++;
            }
            left++;
        }

        return result;
        
    }
}