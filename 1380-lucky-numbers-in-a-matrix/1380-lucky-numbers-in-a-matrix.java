class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] rowMin = new int[matrix.length];
        int[] colMax = new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                min = Math.min(matrix[i][j],min);
            }
            rowMin[i] = min;
        }

        for(int j=0;j<matrix[0].length;j++)
        {
            int max= Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++)
            {
                max = Math.max(matrix[i][j],max);
            }
            colMax[j] = max;
        }

        List<Integer> luckyNumbers = new ArrayList<>();
        for(int i:rowMin)
        {
            for(int j:colMax)
            {
                if(i==j)
                    luckyNumbers.add(i);
            }
        }

        return luckyNumbers;
    }
}