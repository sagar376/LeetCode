class Solution {
    public String gcdOfStrings(String str1, String str2) {
       
       return ((str2+str1).equals(str1+str2))?str1.substring(0,findGcd(str1,str2)):"";
        
    }

    public int findGcd(String str1,String str2)
    {
        int length1=str1.length();
        int length2=str2.length();

        while(length1!=length2)
        {
            if(length1<length2)
            {
                length2=length2-length1;
            }
            else if(length1>length2)
            {
                length1=length1-length2;
            }
        }
        return length2;
    }
}