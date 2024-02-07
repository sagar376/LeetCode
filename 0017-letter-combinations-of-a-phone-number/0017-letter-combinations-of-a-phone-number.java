class Solution {
    Map<Character, String> digitToChar = Map.of(
        '2',
        "abc",
        '3',
        "def",
        '4',
        "ghi",
        '5',
        "jkl",
        '6',
        "mno",
        '7',
        "pqrs",
        '8',
        "tuv",
        '9',
        "wxyz"
    );
    public List<String> letterCombinations(String digits) {
        
        
        if(digits.length()==0)return new ArrayList();
        List<String> ans=new ArrayList<>();
        String cur=new String();
        solve(0,cur,ans,digits);
        return ans;
        
    }
    
    private void solve(int index,String cur,List<String> ans,String digits)
    {
        if(digits.length()==cur.length())
        {
            ans.add(cur);
            return;
        }
        
        String ch=digitToChar.get(digits.charAt(index));
        for(char c:ch.toCharArray())
        {
            solve(index+1,cur+c,ans,digits);
        }
        
    }
}