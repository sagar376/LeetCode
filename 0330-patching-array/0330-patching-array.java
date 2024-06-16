class Solution {
    public int minPatches(int[] nums, int n) {

        int size=nums.length;
        int i=0;
        int maxReach=0;
        int patch=0;

        while(maxReach<n)
        {
            if(i<size && nums[i] <= maxReach+1)
            {
                maxReach+=nums[i];
                i++;
            }
            else
            {
                maxReach+=maxReach+1;
                patch++;
            }
        }
        return patch;

        
    }
}