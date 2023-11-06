class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;

        while(left <= right)
        {
            int mid = left+(right - left)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid] >= nums[left])
            {
                if(target < nums[mid] && target >= nums[left])
                {
                    right = mid  - 1;
                }
                else
                {
                    left =mid + 1;
                }
            }
            else
            {
                if(target <= nums[right] && target > nums[mid])
                {
                     left = mid +1;
                }
                else
                {
                   right = mid -1;
                }
            }

            // if(nums[l]<=nums[mid]){
            //     if(target > nums[mid] || target < nums[l]){
            //         l = mid + 1;
            //     }else{
            //         r = mid - 1;
            //     }
            // }else{//right sorted
            //     if(target < nums[mid] || target > nums [r]){
            //         r = mid - 1;
            //     }else{
            //         l = mid + 1;
            //     }
            // }
        }
        return -1;
        



        

       
    }
}