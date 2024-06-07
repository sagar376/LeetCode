class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        String[] words=sentence.split(" ");

        StringBuilder string=new StringBuilder();

        Set<String> dict=new HashSet<>(dictionary);

        String[] result=new String[words.length];

        for(int i=0;i<result.length;i++)
        {
            result[i]=checkDictionary(words[i],dict);
        }

        return String.join(" ",result);

        
        
    }
    private String checkDictionary(String word,Set dict)
    {
        StringBuilder expectedWord=new StringBuilder();
        for(int i=0;i<word.length();i++)
        {   
            
            if(dict.contains(expectedWord.append(word.charAt(i)).toString()))
            {
                
                return expectedWord.toString();
            }
        }
        return word;
    }
}