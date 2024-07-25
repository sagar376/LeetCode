class Solution {
    public int rob(int[] nums) {

        // solve 198. House Robber same logic but slight modification
        // No need of any new logic ,
        // whatever the answer cannot contain first & last element together
        // Hence remove first element & perform same method 
        // remove last element & perfomr same method

        // finally find max of both solutions

        // directly implementing tabulation method here

        int size = nums.length;
        //declare 2 temp array without first & last element

        if(nums.length == 1) return nums[0];  // important base case

        return Math.max(solve(nums, 0 , size -2), solve(nums, 1, size-1));


        
    }

    private int solve(int[] temp,int start, int end)
    {
        int prev = temp[start];
        int prev2 = 0;

        for(int i=start+1; i<= end ;i++)
        {
            int pick = temp[i] + prev2;
            int notpick = 0 + prev;
            int curri = Math.max(pick, notpick);
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
}