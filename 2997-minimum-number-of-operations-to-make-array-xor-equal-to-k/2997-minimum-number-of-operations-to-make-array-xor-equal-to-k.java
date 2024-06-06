class Solution {
    public int minOperations(int[] nums, int k) {

        int finalXor=0;
        for(int num:nums)
        {
            finalXor^=num;
        }

    //method-1
        //return Integer.bitCount(finalXor^k);
        ///

        //method-2
        int count=0;

        while(k>0 || finalXor>0)
        {
            if( (k%2) != (finalXor%2) )
            {
                count++;
            }

            k/=2;
            finalXor/=2;

        }

        return count;
        
    }
}