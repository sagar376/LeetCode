class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> firstIndex=new HashMap<>();
    
        int ans=-1;
        
        for(int i=0;i<s.length();i++)
        {
            if(firstIndex.containsKey(s.charAt(i)))
            {
                //Normally, the length of a substring defined by left, right would be right - left + 1. However, we are not considering s[left] or s[right]. Thus, we need to subtract 2. Therefore, we would update our answer with right - left - 1 if it is larger.
                ans=Math.max(ans,i-firstIndex.get(s.charAt(i))-1);
            }
            else
            {
                firstIndex.put(s.charAt(i),i);
            }
        }
        return ans;
        
    }
}