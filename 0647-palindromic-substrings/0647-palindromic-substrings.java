class Solution {
    public int countSubstrings(String s) {
        //https://youtu.be/nw7ofFCGl6w
        
        int size=s.length();
        int count=0;
        for(int i=0;i<size;i++)
        {
           count+=palindrome(s,i,i)+palindrome(s,i,i+1); 
        }
        return count;
    }
    
    public int palindrome(String s,int l,int r)
    {
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
            count++;
        }
        return count;
    }
}