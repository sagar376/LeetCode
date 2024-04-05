class Solution {
    public String makeGood(String s) {

        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));

        for(int i=1;i<s.length();i++)
        {
            if(st.size()>0)
            {
                if(Math.abs(st.peek()-s.charAt(i))==32)
                {
                    st.pop();
                    continue;
                }

            }
                st.push(s.charAt(i));
            
        }
        //StringBuilder answer=new StringBuilder();
        String answer1="";
        while(st.size()>0)
        {
            //answer.append(st.pop());
            answer1=st.pop()+answer1;

        }
        // return answer.toString();
        return answer1;
        
        
    }
}