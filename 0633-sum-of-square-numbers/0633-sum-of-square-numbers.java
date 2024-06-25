class Solution {
    public boolean judgeSquareSum(int c) {

     int start=0;
     int end=(int)Math.sqrt(c);

     while(start<=end)
     {
        long value=(start*start) + (end * end);

        if(value>c)
        {
            end--;
        }
        else if(value<c)
        {
            start++;
        }
        else
        {
           return true;
        }
     }
     return false;

        
    }
}