class Solution {
    public int minOperations(int[] nums, int k) {

        int finalXor=0;
        for(int num:nums)
        {
            finalXor^=num;
        }

        return Integer.bitCount(finalXor^k);
        
    }
}