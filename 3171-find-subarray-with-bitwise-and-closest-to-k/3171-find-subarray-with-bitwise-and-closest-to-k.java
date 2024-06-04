class Solution {


    // https://www.youtube.com/watch?v=BWBKtU8Euno
    public int minimumDifference(int[] nums, int k) {

        int AND=nums[0];
        int i=0;
        int j=0;
        int[] freq=new int[32];
        int result=Integer.MAX_VALUE;

        while(j<nums.length)
        {
            AND&=nums[j];
            update(1,nums[j],freq);
            result=Math.min(result,Math.abs(k-AND));

            if(AND > k)
            {
                j++;
            }
            else if(AND < k)
            {
                while(i<=j && AND < k)
                {
                    update(-1,nums[i],freq);
                    i++;
                    AND=0;
                    for(int b=0;b<32;b++)
                    {
                        if( (j-i+1) == freq[b])
                        {
                            AND =AND | (1 << b);
                        }
                    }
                    result=Math.min(result,Math.abs(k-AND));
                }
                
                j++;
            }
            else
            {
                return 0;
            }
            
        }
        return result;
    }

    private void update(int op,int val,int[] freq)
    {
        int i = 0;
        while (val > 0) {
            if ((val & 1) == 1) {
                freq[i] += op; // +1 in case of adding and -1 in case of removing
            }
            val /= 2;
            i++;
        }
    }


    //     int closest=Integer.MAX_VALUE;
        
        
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         for(int j=0;j<nums.length;j++)
    //         {
    //             closest=Math.min(closest,substring(i,j,k,nums));
    //         }
    //     }

    //     return closest;

    //     // for(int i=0;i<nums.length;i++)
    //     // {
    //     //     closest=Math.min(Math.abs(k-nums[i]),closest);
    //     // }

    //     // return 7 & 8;
        
    // }

    // private int substring(int start,int end,int k,int[] nums)
    // {
    //     int result=nums[start];
    //     for(int i=start;i<=end;i++)
    //     {
    //         // closest=Math.min(Math.abs(k-nums[i]),closest);
    //         result&=nums[i];
    //     }
    //     return Math.abs(k-result);

    // }
}