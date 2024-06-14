class Solution {
    public int minOperations(int[] nums) {

        int operations=0;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(prev>=nums[i])
            {
                operations+=(prev+1)-nums[i];
                prev=prev+1;
            }
            else
            {
                prev=nums[i];
            }
            
        }

        return operations;
        
    }
}