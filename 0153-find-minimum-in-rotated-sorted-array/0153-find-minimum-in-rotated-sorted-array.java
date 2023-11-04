class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        int mid =0 ;
        

        while(left <= right)
        {
            mid = left + (right - left)/2;
            if(left == mid && right == mid)
            {
                return nums[mid];
            }
            if(nums[mid] > nums[right])
            {
                left = mid+1;
            }
            else if(nums[mid] < nums[right])
            {
                right = mid;
            }
        }
        return nums[mid];

        
    }
}