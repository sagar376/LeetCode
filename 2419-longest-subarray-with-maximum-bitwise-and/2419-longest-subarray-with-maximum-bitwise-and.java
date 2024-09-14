class Solution {
    public int longestSubarray(int[] nums) {

        int maxElement = 1;

        for(int num : nums)
        {
            maxElement = Math.max(maxElement, num);
        }

        int longest = 1;
        for(int i = 0; i < nums.length; i++)
        {
            int count = 0;
            while(i < nums.length && nums[i] == maxElement)
            {
                i++;      
                count++;          
            }
            if(longest < count)
            {
                longest = count;
            }
        }
        return longest;
        
    }
}