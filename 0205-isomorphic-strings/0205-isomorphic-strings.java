class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> mapS2T=new HashMap<Character,Character>();
       HashMap<Character,Character> mapT2S=new HashMap<>();

       for(int i=0;i<s.length();i++)
       {
        if(mapS2T.containsKey(s.charAt(i)))
        {
            if(mapS2T.get(s.charAt(i))!=t.charAt(i))
            return false;
        }
        else
        {
            if(mapT2S.containsKey(t.charAt(i)))
            {
                if(mapT2S.get(t.charAt(i))!=s.charAt(i)))
                return false;
            }
        }
        mapS2T.put(s.charAt(i),t.charAt(i));
        mapT2S.put(t.charAt(i),s.charAt(i));
       }
       return true;
    }
}
