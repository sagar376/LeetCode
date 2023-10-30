class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        if(s.length()%2 != 0)return false;

        for(int i=0;i<s.length();i++)
        {
            if(stack.empty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'))
            {
                return false;
            }
            if(s.charAt(i) == ')' && stack.peek() == '(')
            {
                stack.pop();
            }else if(s.charAt(i) == '}' && stack.peek() == '{')
            {
                stack.pop();
            }else if(s.charAt(i) == ']' && stack.peek() == '[')
            {
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();

        
    }
}