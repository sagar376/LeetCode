class Solution {
    public int subsetXORSum(int[] nums) {
        

        List<List<Integer>> subsets=new ArrayList<>();

        List<Integer> subset=new ArrayList<>();

        solve(subsets,0,subset,nums);

        int xor=0;
        int sum=0;
        for(List<Integer> sub:subsets)
        {
            xor=0;
            for(int val:sub)
            {
                xor^=val;
            }
            sum+=xor;
        }

        return sum;
        
    }

    private void solve(List<List<Integer>> subsets,int index,List<Integer> subset,int[] nums)
    {
        if(index==nums.length)
        {
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        solve(subsets,index+1,subset,nums);
        subset.remove(subset.size()-1);
        solve(subsets,index+1,subset,nums);
    }
}