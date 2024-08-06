class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        for(int i=0; i<word.length(); i++)
        {
            freq[word.charAt(i)-'a']++;
        }

        Arrays.sort(freq);

        for(int i = 0;i < freq.length; i++)
        {
            System.out.println(i+ " "+ freq[i]);
        }

        int i = freq.length - 1;
        int minPushed = 0;
        while(i>= 0 && freq[i] > 0)
        {   
            if(i >= 18)
            minPushed += freq[i] * 1;

            else if(i >= 10)
            minPushed += freq[i] * 2;

            else if(i >= 2)
            minPushed += freq[i] * 3;

            else
            minPushed += freq[i] * 4;

            i--;
        }

        return minPushed;

        
    }
}