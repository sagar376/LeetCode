class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];

        for(int i=0;i<=n;i++)
        {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
    // public int countOnes(int n)
    // {
    //     int countOne=0;
    //     int rem;
    //     while(n>0)
    //     {
    //         rem = n%2;
    //         n=n/2;
    //         if(rem==1)
    //         {
    //             countOne++;
    //         }
            
    //     }
    //     return countOne;
    // }
    
}
