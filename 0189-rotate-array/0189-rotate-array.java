class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        k%=size; // Important step for test case example below

// Input:
// [1,2]
// 3
// Output:
// [1,2]
// Expected:
// [2,1]
        
        nums=reverse(nums,0,size-1);
        nums=reverse(nums,0,k-1);
        nums=reverse(nums,k,size-1);
        
        
    }
    
    public int[] reverse(int[]nums ,int left,int right)
    {
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        // System.out.println();
        // for(int val:nums)
        //     System.out.print(val+" ");
        return nums;
    }
}