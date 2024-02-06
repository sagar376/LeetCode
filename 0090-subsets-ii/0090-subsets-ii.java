class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    recur(0, new ArrayList<>(), nums, ans);
    return ans;

  }

  public void recur(int index, List<Integer> ds, int[] nums, List<List<Integer>> ans) {
    ans.add(new ArrayList<>(ds));
    for (int i = index; i < nums.length; i++) {
      if (i != index && nums[i] == nums[i - 1]) {
        continue;
      }
      ds.add(nums[i]);
      recur(i + 1, ds, nums, ans);
      ds.remove(ds.size() - 1);
    }
  }
}