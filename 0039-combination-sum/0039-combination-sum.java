class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        int size=candidates.length;
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        
        
        helper(0,target,path,answer,size,candidates);
        return answer;
        
    }
    
    public void helper(int index,int target,List<Integer> path,List<List<Integer>> answer,int n,int[] candidates)
    {
        if(target==0)
        {
            answer.add(new ArrayList<>(path));
            return;
        }
        if(index==n || target < 0)
        {
            return;
        }
        path.add(candidates[index]);
        helper(index,target-candidates[index],path,answer,n,candidates);
        path.remove(path.size()-1);
        helper(index+1,target,path,answer,n,candidates);
    }
    
    
}