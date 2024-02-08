class Solution {
    public List<List<String>> partition(String s) {
        
        int length=s.length();
        List<List<String>> ans=new ArrayList<>();
        List<String> path=new ArrayList<>();
        
        solve(0,path,s,ans,length);
        return ans;
        
    }
    
    public void solve(int index,List<String> path,String s,List<List<String>> ans,int n)
    {
        if(index==n)
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        
        for(int i=index;i<n;i++)
        {
            if(palindrome(s,index,i))
            {
                path.add(s.substring(index,i+1));
                solve(i+1,path,s,ans,n);
                path.remove(path.size()-1);
            }
        }
    }
    boolean palindrome(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}