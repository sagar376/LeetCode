class Solution {
    public int missingNumber(int[] nums) {
        int size=nums.length;
        int expectedSum=(size*(size+1))/2;
        int actualSum=calculateTotalSum(nums);
        int missingNum=expectedSum-actualSum;
        return missingNum;
        
    }
    private int calculateTotalSum(int[] nums)
    {
        int totalSum=0;
        for(int i=0;i<nums.length;i++)
        {
            totalSum+=nums[i];
        }
        return totalSum;
    }
}