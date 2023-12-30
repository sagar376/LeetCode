class Solution {
    public boolean makeEqual(String[] words) {
        
        int[] count=new int[26];
        int size=words.length;
        
        for(String word:words)
        {
            for(int i=0;i<word.length();i++)
            {
                count[word.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>0)
            {
                if(count[i]%size!=0)
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}