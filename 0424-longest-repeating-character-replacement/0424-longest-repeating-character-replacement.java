class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int start=0;
        int ans=0;
        int maxFrequency=0;

        for(int end=0;end<s.length();end++)
        {
            count[s.charAt(end)-'A']++;
            maxFrequency = Math.max(maxFrequency,count[s.charAt(end)-'A']);
            if(end-start+1-maxFrequency > k)
            {
                count[s.charAt(start)-'A']--;
                start++;  
            }
            ans=Math.max(ans,end-start+1);
        }
        //System.out.println(s[0]);
        return ans;
        
    }
}