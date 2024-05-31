class Solution {
    public int[] singleNumber(int[] nums) {

        int xor=0;

        for(int num:nums)
        {
            xor^=num;
        }

        int xor2=xor & (-xor);

        // int[] result=new int[2];
        int a=0;
        int b=0;

        for(int num:nums)
        {
            if((xor2 & num) ==0)
            {
                a^=num;
            }
            else
            b^=num;
        }

        return new int[]{a,b};
        
    }
}