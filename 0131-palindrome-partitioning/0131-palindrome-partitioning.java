class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> result=new ArrayList<>();
        List<String> currentString=new ArrayList<>();
    

        solve(0,s,result,currentString);
        return result;
        
    }

    private void solve(int index,String s,List<List<String>> result,List<String> currentString)
    {
        if(index==s.length())
        {
            result.add(new ArrayList<>(currentString));
            return;
        }

        for(int i=index;i<s.length();i++)
        {
            if(checkPalindrome(s.substring(index,i+1)))
            {
                currentString.add(s.substring(index,i+1));
                solve(i+1,s,result,currentString);
                currentString.remove(currentString.size()-1);
            }
        }
    }

    private boolean checkPalindrome(String s)
    {
        int start=0,end=s.length()-1;
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