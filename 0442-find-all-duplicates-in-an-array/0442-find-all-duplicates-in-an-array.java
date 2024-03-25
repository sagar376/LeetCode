class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] freq=new int[100_000];
        List<Integer> ans=new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(freq[nums[i]]>0)
            {
                ans.add(nums[i]);
            }
            else
            {
              ++freq[nums[i]];  
            }
        }
        
        return ans;
        
    }
}