class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        if(tokens.length == 0)return 0;
        
        int start=0,end=tokens.length-1;
        Arrays.sort(tokens);
        int score=0;
        if(tokens[0]>power)
        return score;

        while(start<=end)
        {
            if(tokens[start]<=power)
            {
                power-=tokens[start];
                start++;
                score++;
            }
            else if(score > 0)
            {
                if(!(end-start>=2))
                return score;
                else
                {
                score--;
                power+=tokens[end];
                end--;
                }
            }
        }

        return score;
        
    }
}