class Solution {
    int m=1000000007;
    public int checkRecord(int n) {

        int result=0;
        int[][][] mem=new int[100001][2][3];
        for (int i = 0; i < 100001; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    mem[i][j][k] = -1;
                }
            }
        }
        result = solve(0,0,n,mem);
        return result;
        
    }

    private int solve(int absent,int late,int n,int[][][] mem)
    {
        if(absent > 1 || late > 2)
        {
            return 0;
        }

        if(n==0)
        {
            return 1;
        }

        if(mem[n][absent][late]!=-1)
        {
            return mem[n][absent][late];
        }


        int l = solve(absent,late+1,n-1,mem)%m;
        int a = solve(absent+1,0,n-1,mem)%m;
        int p = solve(absent,0,n-1,mem)%m;

        return  mem[n][absent][late]=((l + a) % m + p) % m;
    }
}