class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        //int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return nums[i];
            }
            // else{
            //     prev=nums[i];
            // }
        }
        return -1;
    }
}