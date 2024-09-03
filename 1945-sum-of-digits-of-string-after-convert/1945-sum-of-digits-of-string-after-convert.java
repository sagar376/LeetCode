class Solution {
    public int getLucky(String s, int k) {

        String temp = "";

        for(int i=0; i<s.length(); i++)
        {
            temp += s.charAt(i) - 'a' + 1; 
        }

        System.out.println(temp);
        int value = 0;
        for(int i=0; i<temp.length(); i++)
        {
            value += temp.charAt(i) - '0'; 
        }

        //System.out.println("k==1: "+ value);

        int rem = value;

        while(k > 1)
        {
            int tempVal = rem;
            rem = 0;
            while(tempVal > 0)
            {
                rem += tempVal % 10;
                tempVal /= 10; 
            }
            k--;
            tempVal = rem;
            //System.out.println("k == "+k+" : "+ rem);
        }
        //System.out.println(rem);

        return rem;
        
    }
}