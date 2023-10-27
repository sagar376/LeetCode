class Solution {
    public int maxProfit(int[] prices) {

        int left = 0,right=1;
        int maxProfitSoFar=0;

        while(right<prices.length)
        {
            if(prices[left]<prices[right])
            {
                maxProfitSoFar=Math.max(maxProfitSoFar,prices[right]-prices[left]);
            }
            else
            {
                left=right;
            }
            right++;
        }
        return maxProfitSoFar;


        // int maxValue[]=new int[prices.length];
        // maxValue[prices.length-1]=0;
        // int maxSoFar=0;
        

        // for(int i=prices.length-2;i>=0;i--)
        // {
        //     maxValue[i]=Math.max(prices[i+1],maxSoFar);
        //     if(maxSoFar<prices[i+1])
        //     {
        //         maxSoFar=prices[i+1];
        //     }

        // }

        // maxSoFar=0;
        // for(int i=0;i<prices.length-1;i++)
        // {
        //     if(prices[i]>maxValue[i])
        //     continue;
        //     else{
        //         maxSoFar=Math.max(maxValue[i]-prices[i],maxSoFar);
        //     }

        // }
        // return maxSoFar;


        
    }
}