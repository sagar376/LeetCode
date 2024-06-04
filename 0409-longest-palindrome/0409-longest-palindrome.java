class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        int result=0;
        int flag=0;
        for(Character key:map.keySet())
        {
            int value=map.get(key);
            if(value%2==0)
            {
                result+=value;
            }
            else
            {
                if(flag==0)
                {
                    flag=1;
                    result+=value;
                }
                else
                {
                    result+=(value-1);
                }
            }
        }

        
        return result;
    }
}