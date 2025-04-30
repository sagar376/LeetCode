class Solution {
    public int findNumbers(int[] nums) {

        int totalNumbers = 0;

        for(int num:nums)
        {
            int count = 0;
            while(num >= 1)
            {
                num = num/10;
                count++;
            }
            if(count % 2 == 0)
            {
                totalNumbers++;
            }
        }




        return totalNumbers;


        
    }
}