class Solution {
    public String[] findRelativeRanks(int[] score) {

        HashMap<Integer,String> map=new HashMap<>();

        int[] dummy=score.clone();

       

        Arrays.sort(score);

       

        int length=score.length;

        for(int i=length-1;i>=0;i--)
        {
            if(length-1==i)
            {
               map.put(score[i],"Gold Medal"); 
            }
            else if(length-2==i)
            {
                map.put(score[i],"Silver Medal");
            }
            else if(length-3==i)
            {
                map.put(score[i],"Bronze Medal");
            }
            else
            {
                map.put(score[i],Integer.toString(length-i));
            } 
        }
        

        String[] answer=new String[length];
        for(int i=0;i<length;i++)
        {
            answer[i]=map.get(dummy[i]);
        }

        return answer;
        
    }
}