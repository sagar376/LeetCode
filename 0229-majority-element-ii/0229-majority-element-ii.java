class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int cand1=0;
        int cand2=0;
        int count1=0;
        int count2=0;
        List<Integer> ans=new ArrayList<>();
        
        for(int num:nums)
        {
            if(cand1==num)
            {
                count1++;
            }
            else if(cand2==num)
            {
                count2++;
            }
            else if(count1==0)
            {
                cand1=num;
                count1=1;
            }
            else if(count2==0)
            {
                cand2=num;
                count2=1;
            }
            else 
            {
                count1--;count2--;
            }
        }
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(cand1==nums[i])
            {
                count1++;
            }
            else if(cand2==nums[i])
            {
                count2++;
            }
        }
        if(count1>nums.length/3)
        {
            ans.add(cand1);
        }
        if(count2>nums.length/3)
        {
            ans.add(cand2);
        }
        return ans;
        
    }
}