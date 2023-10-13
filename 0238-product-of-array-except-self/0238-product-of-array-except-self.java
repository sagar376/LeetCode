class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int left =1 ; int product=1;
        prefix[0]=left;
        for(int i=1;i<nums.length;i++)
        {    
            left=nums[i-1];  
             prefix[i]=left*prefix[i-1];
        }
        
        for(int i=nums.length-2;i>=0;i--)
        {
            
             product*=nums[i+1];
            prefix[i]=prefix[i]*product;
           
        }
        return prefix;
    }
    
        
}