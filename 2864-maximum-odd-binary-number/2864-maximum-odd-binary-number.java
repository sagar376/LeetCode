class Solution {
    public String maximumOddBinaryNumber(String s) {
        

        int countOnes=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            countOnes++;
        }

        StringBuilder answer=new StringBuilder();

       for(int i=0;i<s.length()-1;i++)
       {
           if(countOnes==0)
           {
               answer.append('0');
           }
           else
           {
               answer.append('1');
               countOnes--;
           }
       }
        answer.append('1');
        return answer.toString();
    }
}