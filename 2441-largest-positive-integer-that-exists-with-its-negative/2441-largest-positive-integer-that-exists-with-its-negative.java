class Solution {
    public int findMaxK(int[] nums) {

        Arrays.sort(nums);

        int start=0;
        int end=nums.length-1;

        while(nums[start]<0 && nums[end]>0)
        {
            int value=Math.abs(nums[start])-Math.abs(nums[end]);
            if(value==0)
            {
                return nums[end];
            }
            else if(value > 0)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return -1;
        
    }
}