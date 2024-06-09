class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int n = nums.length;
        int prefixMod = 0, result = 0;

        // There are k mod groups 0...k-1.
        int[] modGroups = new int[k];
        modGroups[0] = 1;

        int sum=0;
        int rem=0;

        for(int num:nums)
        {
            sum+=num;

            rem = sum % k;

            if(rem < 0)
            {
                rem+=k;  // check CodeStorywithMik for explaination
            }

            result+=modGroups[rem];
            // Add the count of subarrays that have the same remainder as the current
            // one to cancel out the remainders
            modGroups[rem]++;

        }

        return result;


    }

}