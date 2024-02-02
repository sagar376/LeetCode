class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> answer=new ArrayList<>();
        
        
        for(int num=0;num <=Math.pow(2,n)-1;num++)
        {   
            List<Integer> path=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if((num & (1<<i))!=0)
                {
                    path.add(nums[i]);
                }
            }
            answer.add(new ArrayList<Integer>(path));
        }
        
        return answer;
        
        
        
        // List<List<Integer>> answer=new ArrayList<>();
        // List<Integer> path=new ArrayList<>();
        // return subFunc(nums,answer,0,path);
        
    }
    // public List<List<Integer>> subFunc(int[] nums,List<List<Integer>> answer,int index,List<Integer> path)
    // {
    //     if(index>=nums.length)
    //     {
    //        answer.add(new ArrayList<>(path));
    //        return answer;
    //     }
    //     path.add(nums[index]);
    //     answer=subFunc(nums,answer,index+1,path);
    //     path.remove(path.size()-1);
    //     answer=subFunc(nums,answer,index+1,path);
    //     return answer;
    // }
}