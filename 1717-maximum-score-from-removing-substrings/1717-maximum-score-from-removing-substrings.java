class Solution {
    public int maximumGain(String s, int x, int y) {
        int xCount=0;
        int yCount=0;

        Stack<Character> pri=new Stack<>();
        Stack<Character> sec=new Stack<>();

        if(x > y)
        {
            for(char ch:s.toCharArray())
            {
                if(!pri.isEmpty() && pri.peek()=='a' && ch=='b')
                {
                    pri.pop();
                    xCount++;
                }
                else
                {
                    pri.push(ch);
                }
            }
            while(!pri.isEmpty())
            {
                char ch=pri.pop();
                if(!sec.isEmpty() && sec.peek()=='a' && ch=='b')
                {
                    yCount++;
                    sec.pop();
                }
                else
                {
                    sec.push(ch);
                }
            }
        }
        else
        {
            for(char ch:s.toCharArray())
            {
                if(!pri.isEmpty() && pri.peek()=='b' && ch=='a')
                {
                    pri.pop();
                    yCount++;
                }
                else
                {
                    pri.push(ch);
                }
            }
            while(!pri.isEmpty())
            {
                char ch=pri.pop();
                if(!sec.isEmpty() && sec.peek()=='b' && ch=='a')
                {
                    xCount++;
                    sec.pop();
                }
                else
                {
                    sec.push(ch);
                }
            }

        }
        return (x*xCount)+(y*yCount);
    }
}