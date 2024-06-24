class Solution {
    public int minOperations(int[] nums) {

        int i=0;
        int minOp=0;

        while(i< nums.length)
        {
            if(nums[i]==0)
            {
                if(check(i,nums))
                minOp++;
                else
                return -1;
            }
            i++;
        }
        return minOp;
    }
    private boolean check(int index,int[] nums)
        {
            if(index<nums.length-2)
            {
               nums[index]=nums[index]==0?1:0;
                nums[index+1]=nums[index+1]==0?1:0;
                nums[index+2]=nums[index+2]==0?1:0;
                return true;
            }
            else
            {
                return false;
            }
        }
}