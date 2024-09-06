class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];

        for(int i = 0; i < chars.length(); i++)
        {
            freq[chars.charAt(i) - 'a']++;
        }

        int result = 0;
        for(String word: words)
        {
            int[] temp = Arrays.copyOf(freq, freq.length);
            boolean comp = true;
            for(int i = 0; i < word.length(); i++)
            {
                if(temp[word.charAt(i) - 'a'] > 0)
                {
                    temp[word.charAt(i) - 'a']--;
                }
                else
                {
                    comp = false;
                    break;
                }
            }

            if(comp)
            {
                result += word.length();
            }
            

        }
        return result;
        
    }
}