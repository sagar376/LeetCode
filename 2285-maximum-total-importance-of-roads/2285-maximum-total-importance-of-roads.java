class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int row=roads.length;
        int col=roads[0].length;
        int[] degree=new int[n];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                degree[roads[i][j]]++;
            }
        }

        Arrays.sort(degree);

        long totalImportance=0;
        int value=1;

        for(int num:degree)
        {
            totalImportance+=(long)num*value;
            value++;
        }

        return totalImportance ;


        
    }
}