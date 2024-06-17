class Solution {
    public boolean judgeSquareSum(int c) {

        int start=0;
        int end=(int)Math.sqrt(c);

        while(start<=end)
        {
            long value=(int)Math.pow(start,2)+(int)Math.pow(end,2);

            if(value==c)
            return true;

            else if(value > c)
            {
                end--;
            }

            else
            {
                start++;
            }
        }


        return false;

        
    }
}