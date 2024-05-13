class Solution {
    public int matrixScore(int[][] grid) {

        int n = grid.length; // row
        int m = grid[0].length; // col

        int[][] temp = Arrays.stream(grid)
                .map(int[]::clone)
                .toArray(int[][]::new);

        // 1. flip the row if first element is 0.
        for (int i = 0; i < n; i++) {
            if (temp[i][0] == 0) {
                temp = flipRow(i, 0, temp);
            }
        }

        // 2.toggle column if no of 0's > no of 1's

        for (int i = 1; i < m; i++) {
            if (countOnes(0, i, temp)) {
                temp = flipCol(0, i, temp); // column flip
            }
        }

        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        //     // Iterate over each element in the row and print it
        //     int rowSum = 0;
        //     for (int j = 0; j < m; j++) {
        //         if (temp[i][j] == 1)
        //             rowSum += Math.pow(2, m - j - 1);
        //     }
        //     sum += rowSum;
        // }
        int sum=0;
        for(int i=0; i<n; i++){
           int dec = 0;
        for(int j=0; j<m; j++){
            dec = dec*2+temp[i][j];
        }
            sum+=dec;
       }

        return sum;

    }

    private int[][] flipRow(int row, int col, int[][] temp) {
        int n = temp.length; // row
        int m = temp[0].length; // col

        for (int i = 0; i < m; i++) {
            temp[row][i] = temp[row][i] == 0 ? 1 : 0;
        }

        return temp;
    }

    private int[][] flipCol(int row, int col, int[][] temp) {
        int n = temp.length; // row
        int m = temp[0].length; // col

        for (int i = 0; i < n; i++) {
            temp[i][col] = temp[i][col] == 0 ? 1 : 0;
        }

        return temp;
    }

    private boolean countOnes(int row, int col, int[][] temp) {
        int n = temp.length; // row
        int m = temp[0].length; // col

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (temp[i][col] == 1)
                count++;
        }

        if (n - count > n / 2) // more no. of zeros
            return true;
        else
            return false;
    }
}