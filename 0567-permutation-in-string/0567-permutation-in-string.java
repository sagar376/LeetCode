class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0,right=0;
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
        }
        int[] freq2=new int[26];
        while( right < s2.length())
        {
            freq2[s2.charAt(right)-'a']++;
            if((right-left+1)==s1.length())
            {
                if(Arrays.equals(freq,freq2))
                {
                    return true;
                }
            }
            if((right-left+1)<s1.length())
            {
                right++;
            }
            else{
                freq2[s2.charAt(left)-'a']--;
                left++;
                right++;
            }

            
            
        }
        
        
     return false;   
    }
}