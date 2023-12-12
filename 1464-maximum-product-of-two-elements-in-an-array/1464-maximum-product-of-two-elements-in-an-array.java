class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int nextMax=Integer.MIN_VALUE;
        
        for(int num:nums)
        {
            if(num>max)
            {
                nextMax=max;
                max=num;
            }
            else
            {
                nextMax=Math.max(num,nextMax);
            }
        }
        return (max-1)*(nextMax-1);
        
    }
}