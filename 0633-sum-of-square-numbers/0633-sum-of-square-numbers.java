class Solution {
    public boolean judgeSquareSum(int c) {

        int start=0;
        int end=(int)Math.sqrt(c);

        while(start<=end)
        {
            long value=(long)Math.pow(start,2)+(long)Math.pow(end,2);


            System.out.println(value);

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