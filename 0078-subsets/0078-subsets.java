class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        return subFunc(nums,answer,0,path);
        
    }
    public List<List<Integer>> subFunc(int[] nums,List<List<Integer>> answer,int index,List<Integer> path)
    {
        if(index>=nums.length)
        {
           answer.add(new ArrayList<>(path));
           return answer;
        }
        path.add(nums[index]);
        answer=subFunc(nums,answer,index+1,path);
        path.remove(path.size()-1);
        answer=subFunc(nums,answer,index+1,path);
        return answer;
    }
}