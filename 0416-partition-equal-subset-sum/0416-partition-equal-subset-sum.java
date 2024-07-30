class Solution {
    public boolean canPartition(int[] nums) {

        int totSum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            totSum += nums[i];
        }

        if(totSum % 2 == 1)
        return false;

        int k = totSum/2;
        boolean[] prev = new boolean[k + 1];
        boolean[] curr = new boolean[k + 1];

        

        prev[0] = true;
        curr[0] = true;

        if(nums[0] == k) prev[nums[0]] = true;

        for(int ind = 1; ind < nums.length; ind++)
        {
            for(int target = 1 ; target <= k ; target++)
            {
                boolean notTake = prev[target];
                boolean take = false;
                if(nums[ind] <= target)
                take = prev[target - nums[ind]];
                curr[target] = take || notTake;

                //System.out.println(Arrays.toString(prev));
                
            }
            prev = Arrays.copyOf(curr, curr.length);
        }

        return prev[k];  
        


    }
}