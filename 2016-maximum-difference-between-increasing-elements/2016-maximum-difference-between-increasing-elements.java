class Solution {
    public int maximumDifference(int[] nums) {

        int min = nums[0];
        int potentialAnswer = -1;

        for(int i = 1; i < nums.length ; i++)
        {
            if(min > nums[i])
            {
                min = nums[i];
            }   
            else{
                potentialAnswer = Math.max( nums[i] - min, potentialAnswer);
            }    
        }

        return potentialAnswer;
        
    }
}