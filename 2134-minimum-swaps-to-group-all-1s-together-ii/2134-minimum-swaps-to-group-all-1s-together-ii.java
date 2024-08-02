class Solution {
    public int minSwaps(int[] nums) {

        int totalOnes = 0;

        for(int num:nums)
        {
            totalOnes += num;
        }

        if(totalOnes == 0 || totalOnes == nums.length)
        return 0;
        
        int windowSize = totalOnes;
        System.out.println(windowSize);

        int minSwaps = Integer.MAX_VALUE;

        int currentSwaps = 0;
        // first window
        for(int i = 0; i < windowSize; i++)
        {
            if(nums[i]==0)
             currentSwaps++;
        }

        System.out.println(currentSwaps);
        minSwaps = Math.min(minSwaps, currentSwaps);
        System.out.println(minSwaps);
        
        // traverse full array with sliding window
        int begin = 0;
        int end = windowSize;
        while(end < nums.length)
        {
            if(nums[begin] == 0)
            {
                currentSwaps--;
            }
            if(nums[end] == 0)
            {
                currentSwaps++;
            }
            begin++;
            end++;
            System.out.println("begin & cswaps "+ begin + " " +currentSwaps);
            minSwaps = Math.min(minSwaps, currentSwaps); 
        }

        //For wrap around case
        end = 0;
        while(end < windowSize)
        {
            if(nums[begin] == 0)
            {
                currentSwaps--;
            }
            if(nums[end] == 0)
            {
                currentSwaps++;
            }
            begin++;
            end++;
            System.out.println("last-begin & cswaps  "+ begin + " " +currentSwaps);
            minSwaps = Math.min(minSwaps, currentSwaps);
        }

        return minSwaps;
    }
}