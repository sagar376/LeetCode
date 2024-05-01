class Solution {
    public String reversePrefix(String word, char ch) {

        char[] letter=word.toCharArray();
        int start=0,end=-1;

        for(int i=0;i<letter.length;i++)
        {
            if(letter[i]==ch)
            {
                end=i;
                break;
            }
        }

        if(end==-1)
        {
            return word;
        }
        else
        {
            while(start<=end)
            {
                char temp=letter[end];
                letter[end]=letter[start];
                letter[start]=temp;
                start++;
                end--;
            }
        }

        return new String(letter);
        
    }
}