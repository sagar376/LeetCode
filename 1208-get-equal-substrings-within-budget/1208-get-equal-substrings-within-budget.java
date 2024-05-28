class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxSoFar=0;
        int start=0;
        int end=0;
        int temp=0;
        while(end < s.length())
        {
            temp+=Math.abs(s.charAt(end)-t.charAt(end));
            while(temp > maxCost)
            {
                temp-=Math.abs(s.charAt(start)-t.charAt(start));
                start++;
            }
            maxSoFar=Math.max(maxSoFar,end-start+1);
            end++;
        }
        return maxSoFar;
        
    } 
}