class Solution {
    public int[] sortedSquares(int[] nums) {

        //2 pointers approach 
        //Intuition https://www.youtube.com/watch?v=e2GYhjdSAos

        int[] answer=new int[nums.length];
        int start=0,end=nums.length-1;
        // for(int i=nums.length-1;i>=0;i--)
        // {
        //     if(Math.abs(nums[start])>=Math.abs(nums[end]))
        //     {
        //     answer[i]=nums[start]*nums[start];
        //     start++;
        //     }
        //     else
        //     {
        //         answer[i]=nums[end]*nums[end];
        //         end--;
        //     }
        // }
        int i=nums.length-1;
        while(start<=end)
        {
            if(Math.abs(nums[start])>=Math.abs(nums[end]))
            {
                answer[i]=nums[start]*nums[start];
                start++;
            }
            else
            {
                answer[i]=nums[end]*nums[end];
                end--;
            }
            i--;
        }
        return answer;
    }
}