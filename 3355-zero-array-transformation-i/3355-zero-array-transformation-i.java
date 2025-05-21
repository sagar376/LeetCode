class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

        for(int i = 0; i < queries.length; i++)
        {
            int left = queries[i][0];
            int right = queries[i][1];
            for(int j = left; j <= right; j++)
            {
                if(nums[j] != 0)
                {
                    nums[j]--;
                    //nums[j] -= 1;
                }
            }
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            return false;
        }

        return true;
        
    }
}