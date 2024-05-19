class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {

        int count=0;
        long sum=0;
        int min_nuksaan=Integer.MAX_VALUE;
        for(int num:nums)
        {
            int temp= num ^ k;
            System.out.println(num+" ^ "+k+" = "+temp);
            if(temp > num)
            {
                count++;
                sum+=temp;
            }
            else
            {
                sum+=num;
               
            }
             min_nuksaan=Math.min(min_nuksaan,Math.abs(num-temp));
            System.out.println("idl_Sum: "+sum+" Count "+count+" min_nuksaan "+min_nuksaan );
        }

        if(count%2==0)
        {
            return sum;
        }
        else
        {
            return sum-min_nuksaan;
        }
        
    }
}