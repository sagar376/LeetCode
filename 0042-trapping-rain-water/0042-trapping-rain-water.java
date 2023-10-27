class Solution {
    public int trap(int[] height) {

    //     int left=0,right=height.length-1;
    //     int[] maxLeft=new int[height.length];
    //     int[] maxRight=new int[height.length];
    //     int answer=0,max=height[0];

    //     for(int i=0;i<=height.length-1;i++)
    //     {
    //       maxLeft[i]=Math.max(max,height[i]);
    //       max=maxLeft[i];
    //     }
        
    //     max=height[height.length-1];
    //     for(int i=height.length-1;i>=0;i--)
    //     {
    //         maxRight[i]=Math.max(max,height[i]);
    //         max=maxRight[i];
    //     }

    //     for(int i=0;i<height.length;i++)
    //     {
    //         answer += Math.min(maxLeft[i],maxRight[i])-height[i];
    //     }
      
    //   return answer;


    //Solution 2 O(1) memory 2 pointer technique

    int l=1,r=height.length-2;
    int leftMax=height[0],rightMax=height[height.length-1];
    int answer=0;

    while(l<=r)
    {
        if(leftMax<=rightMax)
        {
            leftMax=Math.max(leftMax,height[l]);
            answer+=leftMax-height[l];
            l++;
        }
        else
        {
            rightMax=Math.max(rightMax,height[r]);
            answer+=rightMax-height[r];
            r--;

        }
    }
    return answer;

    }
}