class Solution {
    public long countSubarrays(int[] nums, int k) {
        if(nums.length<k)
        return 0;

        int maxElement=findMax(nums);

        long ans = 0;
        int start = 0, maxElementsInWindow = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == maxElement) {
                maxElementsInWindow++;
            }
            while (k == maxElementsInWindow) {
                if (nums[start] == maxElement) {
                    maxElementsInWindow--;
                }
                start++;
            }
            ans += start;
        }

        return ans;
        
    }

    private int findMax(int[] nums)
    {
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        return max;
    }
}