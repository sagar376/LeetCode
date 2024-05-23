class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        
        List<List<Integer>> subset=new ArrayList<>();
        List<Integer> beautSet=new ArrayList<>();

        backtrack(nums,0,k,subset,beautSet);

        return subset.size();
        
    }

    private void backtrack(int[] nums,int index,int k,List<List<Integer>> subset,List<Integer> beautSet)
    {
        if(index==nums.length)
        {
          if (!beautSet.isEmpty()) {
                subset.add(new ArrayList<>(beautSet));
            }
            return;
        }

         // Choice 1: Do not include nums[index]
        backtrack(nums, index + 1, k, subset, beautSet);

        // Choice 2: Include nums[index] if it maintains the "beautiful" property
        if (!beautSet.contains(nums[index] + k) && !beautSet.contains(nums[index] - k)) {
            beautSet.add(nums[index]);
            backtrack(nums, index + 1, k, subset, beautSet);
            beautSet.remove(beautSet.size() - 1);
        }
    }
}