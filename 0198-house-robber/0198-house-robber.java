class Solution {
    public int rob(int[] nums) {
        int rob1=0,rob2=0;

        int temp=0;
        for(int i:nums)
        {
          temp=Math.max(i+rob1,rob2);
          rob1=rob2;
          rob2=temp;
        }
        return rob2;
    }
}