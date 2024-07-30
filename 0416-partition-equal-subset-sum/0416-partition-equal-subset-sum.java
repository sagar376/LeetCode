class Solution {

    public boolean canPartition(int[] nums) {
        int totSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totSum += nums[i];
        }

        if (totSum % 2 == 1) return false;

        int k = totSum / 2;


        int[][] dp =new int[nums.length][k+1];

        for(int[] row:dp)
        Arrays.fill(row, -1);

        int result = find(nums.length-1, k, nums, dp);

        return dp[nums.length-1][k] == 1;

        


        // boolean[] prev = new boolean[k + 1];
        // // boolean[] curr = new boolean[k + 1];

        // prev[0] = true;
        // if (nums[0] == k) prev[nums[0]] = true;

        // System.out.println(Arrays.toString(prev));

        // for (int ind = 1; ind < nums.length; ind++) {
        //     boolean[] curr = new boolean[k + 1];
        //     curr[0] = true;
        //     for (int target = 1; target <= k; target++) {
        //         boolean notTake = prev[target];
        //         boolean take = false;
        //         if (nums[ind] <= target) take = prev[target - nums[ind]];
        //         curr[target] = take || notTake;
        //     }
            
        //     prev = curr;
        //     System.out.println(Arrays.toString(prev));
        // }

        // return prev[k];
    }

    private int find(int ind,int target,int[] nums,int[][] dp)
    {
        if(target == 0)
        return 1;

        if(ind == 0)
        return nums[0] == target?1:0;

        if(dp[ind][target] != -1)
        return dp[ind][target]; 

        int nottake = find(ind-1, target, nums, dp);
        int take = 0;
        if(target >= nums[ind])
        take = find(ind-1, target - nums[ind] , nums, dp);

        return dp[ind][target] = (nottake + take) >=1 ? 1 :0;
    }
}
