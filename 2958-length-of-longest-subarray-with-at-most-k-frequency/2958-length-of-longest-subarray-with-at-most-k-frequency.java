class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        int start=0;
        int max=0;

        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int end=0;end<nums.length;end++)
        {
            freq.put(nums[end],freq.getOrDefault(nums[end],0)+1);
            while(freq.get(nums[end])>k)
            {
                freq.put(nums[start],freq.getOrDefault(nums[start],0)-1);
                start++;
            }

            max=Math.max(max,end-start+1);
        }
        return max;
        
    }
}