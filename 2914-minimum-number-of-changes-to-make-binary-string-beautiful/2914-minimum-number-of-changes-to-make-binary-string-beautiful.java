class Solution {
    public int minChanges(String s) {

        int minChange = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != s.charAt(i + 1))
            {
                minChange++;
            }
            i++;
        }

        return minChange;
        
    }
}