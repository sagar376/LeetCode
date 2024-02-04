class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        int size=nums.length;
        
        helper(answer,ds,nums,used);
        
        return answer;
        
    }
    public void helper(List<List<Integer>> answer,List<Integer> ds,int[] nums,boolean[] used)
    {
        if(ds.size()==nums.length)
        {
            answer.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
                continue;
            ds.add(nums[i]);
            used[i]=true;
            helper(answer,ds,nums,used);
            used[i]=false;
            ds.remove(ds.size()-1);
        }
    }
}