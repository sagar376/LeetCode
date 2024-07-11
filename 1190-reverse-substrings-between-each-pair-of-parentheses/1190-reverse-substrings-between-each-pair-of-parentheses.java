class Solution {
    public String reverseParentheses(String s) {

        Stack<Integer> openBrackets=new Stack<>();
        StringBuilder result=new StringBuilder();

        for(char currentChar:s.toCharArray()){
            if(currentChar=='(')
            {
                openBrackets.push(result.length());
            }
            else if(currentChar==')')
            {
                int start=openBrackets.pop();
                reverse(result,start,result.length()-1);
            }
            else
            {
                result.append(currentChar);
            }
        }
        return result.toString();
        
    }
    public void reverse(StringBuilder sb,int start,int end)
    {
        while(start<end)
        {
            char temp=sb.charAt(start);
            sb.setCharAt(start++,sb.charAt(end));
            sb.setCharAt(end--,temp);
        }
    }
}