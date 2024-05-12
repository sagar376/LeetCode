class Solution {
    public int[][] largestLocal(int[][] grid) {
        int size = grid.length;
        int[][] maxLocal = new int[size - 2][size - 2];

        for (int row = 0; row < size - 2; row++) {
            for (int col = 0; col < size - 2; col++) {
                maxLocal[row][col] = findMax(row, col, grid);
            }
        }
        return maxLocal;

    }

    private int findMax(int i, int j, int[][] grid) {
        int max = Integer.MIN_VALUE;
        for (int row = i; row <= i + 2; row++) {
            for (int col = j; col <= j + 2; col++) {
                max = Math.max(max, grid[row][col]);
            }
        }
        return max;
    }
}