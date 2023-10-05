import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
//         char s_[]=s.toCharArray();
//         char t_[]=t.toCharArray();

//         Arrays.sort(s_);
//         Arrays.sort(t_);

//         return Arrays.equals(s_,t_);
        
        if(s.length()!=t.length())return false;

        int[] alphaMap = new int[27];
        for(int i=0;i<s.length();i++)
        {
          alphaMap[s.charAt(i)-'a']++;
          alphaMap[t.charAt(i)-'a']--;
        }
        for(int j:alphaMap)
        {
            if(j!=0)return false;
        }
        return true;
        

        
    }
}