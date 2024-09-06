class Solution {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n == original.length) {
            int[][] resultant = new int[m][n];
            int idx = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    resultant[i][j] = original[idx++];
                }
            }
            return resultant;
        } else {
            return new int[0][0];
        }
    }
}
