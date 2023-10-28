class Solution {
    public int lengthOfLongestSubstring(String s) {

        List<Character> word=new ArrayList<>();
        int maxSoFar=0;

        for(int i=0;i<s.length();i++)
        
        {
            if(!word.contains(s.charAt(i)))
            {
                word.add(s.charAt(i));
            }
            else
            {
                while(word.contains(s.charAt(i)))
                {
                    word.remove(0);    
                }
                word.add(s.charAt(i));
            }
            if(maxSoFar<word.size())
            {
                maxSoFar=word.size();
            }
        }
        ///System.out.println(word.stream().collect(Collectors.toList()));
        return maxSoFar;
    }
}