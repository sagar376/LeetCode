class Solution {
    public int rob(int[] nums) {


        int size = nums.length;
        int[] dp = new int[size];

        Arrays.fill(dp, -1);

        dp[size-1] = solve(size-1, dp, nums);

        return dp[size-1];
        
    }

    private int solve(int idx, int[] dp,int[] nums)
    {
        if(idx == 0)
        return nums[0];

        if(idx < 0)
        {
            return 0;
        }

        if(dp[idx] != -1)
        return dp[idx];

        int pick = nums[idx] + solve(idx-2, dp, nums);
        int notPick = 0 + solve(idx-1, dp, nums);

        return dp[idx] = Math.max(pick, notPick);
    }
}