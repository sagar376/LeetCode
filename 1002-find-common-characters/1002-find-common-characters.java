class Solution {
    public List<String> commonChars(String[] words) {

        int[] freq=new int[26];
        

        for(int i=0;i<words[0].length();i++)
        {
            freq[words[0].charAt(i)-'a']++;
        }

        for(int i=1;i<words.length;i++)
        {
            String word=words[i];
            int[] temp=new int[26];
            for(int j=0;j<word.length();j++)
            {
                temp[word.charAt(j)-'a']++;
            }

            for(int count=0;count<26;count++)
            {
                if(freq[count]!=0)
                freq[count]=Math.min(freq[count],temp[count]);
            }
            
        }

        List<String> result=new ArrayList<>();

        for(int i=0;i<26;i++)
        {
            while(freq[i]>0)
            {
                result.add(Character.toString((char)(i+97)));
                freq[i]--;
            }
        }
        return result;
        
    }
}