class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            // if((i==s.length()-1) && (s.charAt(i)==' '))
            // {
            //     continue;
            // }
            // else if(s.charAt(i)==' ')
            // {
            //     return ans;
            // }
            
            // ans++;
             if (s.charAt(i) != ' ') {
                ans++;
            }
            else if (ans > 0) {
                break;
            }

        }
        return ans;
        
    }
}