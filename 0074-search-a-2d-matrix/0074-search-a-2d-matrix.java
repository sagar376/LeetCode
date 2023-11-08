class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length, col = matrix[0].length;
        int start = 0, end = (row * col)-1;

        while(start <= end)
        {
            int mid = start + (end -start)/2;
            int midvalue= matrix[mid/col][mid%col];

            if(midvalue==target)
            {return true;}
            else if(midvalue<target)
            {start = mid +1;}
            else
            {
                end = mid -1;
            }
        }
        return false;
    }
}