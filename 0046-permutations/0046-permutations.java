class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        int size=nums.length;
        
        helper(0,answer,ds,size,nums,used);
        
        return answer;
        
    }
    public void helper(int index,List<List<Integer>> answer,List<Integer> ds,int n,int[] nums,boolean[] used)
    {
        if(ds.size()==n)
        {
            answer.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(used[i])
                continue;
            ds.add(nums[i]);
            used[i]=true;
            helper(i+1,answer,ds,n,nums,used);
            used[i]=false;
            ds.remove(ds.size()-1);
        }
    }
}