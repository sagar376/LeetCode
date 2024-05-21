class Solution {
    public List<List<Integer>> subsets(int[] nums) {


        List<List<Integer>> result=new ArrayList<>();
        List<Integer> set=new ArrayList<>();
        // set.add();
        // result.add(set);

        solve(0,result,set,nums);

        return result;
        
    }

    private void solve(int index,List<List<Integer>> result,List<Integer> set,int[]nums)
    {
        if(index==nums.length)
        {
            result.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[index]);
        solve(index+1,result,set,nums);
        set.remove(set.size()-1);
        solve(index+1,result,set,nums);

    }
}