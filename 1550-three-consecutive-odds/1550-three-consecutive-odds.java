class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        boolean isThreeOdd=false;
        int countForOdd=0;
        for(int num:arr)
        {
            if(num%2!=0)
            {
                countForOdd++;
                if(countForOdd==3)
                {
                    isThreeOdd=true;
                    return isThreeOdd;
                }
            }
            else
            {
                countForOdd=0;
            }
        }
        return isThreeOdd;
        
    }
}