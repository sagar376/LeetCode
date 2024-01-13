class Solution {
    public int minSteps(String s, String t) {
        int[] frqChar=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            frqChar[s.charAt(i)-'a']++;
            frqChar[t.charAt(i)-'a']--;
        }
        
        for(int i:frqChar)
        {
            System.out.print(i+" ");
        }
        int ans=0;
        for(int i=0;i<frqChar.length;i++)
        {
            if(frqChar[i]>0)
                ans+=frqChar[i];
            
        }
        return ans;
        
    }
}