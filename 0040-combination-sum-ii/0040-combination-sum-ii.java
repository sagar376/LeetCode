class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int size=candidates.length;
        
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(candidates);
        
        helper(0,target,ds,size,answer,candidates);
        
        return answer;
 
    }
    public void helper(int index,int target,List<Integer> ds,int n,List<List<Integer>> answer,int[] arr)
    {
        if(target==0)
        {
            answer.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<n;i++)
        {
            if(i>index && arr[i]==arr[i-1])
            {
                continue;
            }
            if(arr[i]>target)break;
            
            ds.add(arr[i]);
            helper(i+1,target-arr[i],ds,n,answer,arr);
            ds.remove(ds.size()-1);
        }
    }
}