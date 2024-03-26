class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> seen=new HashSet<Integer>();
        int smallest=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
            //      if(seen.contains(nums[i]) && smallest==nums[i])
            // {
                seen.add(nums[i]);
                while(seen.contains(smallest))
                {
                    smallest++;
                }
            // }
            // else
            // {
            //     seen.add(nums[i]);

            // }
                
            }
           
        }
        return smallest;
        
    }
}