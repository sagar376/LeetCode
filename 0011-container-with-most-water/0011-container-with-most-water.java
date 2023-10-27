class Solution {
    public int maxArea(int[] height) {
        int answer=0;
        int left=0,right=height.length-1;
        int result =0;

        while(left < right)
        {   
            int area = right-left;
            result = area * Math.min(height[left],height[right]);
            answer = Math.max(result,answer);
            if(height[left] <= height[right])
            {
                left++;
            }
            else
            {
                right--;
            }

        }
        return answer;

        
    }
}