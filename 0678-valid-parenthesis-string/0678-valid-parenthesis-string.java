class Solution {
    public boolean checkValidString(String s) {
        int open=0;
        int close=0;

        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='(' || s.charAt(i)=='*')
          {
            open++;
          }
          else
          {
            open--;
          }
          if(s.charAt(s.length()-1-i)==')' || s.charAt(s.length()-1-i)=='*')
          {
            close++;
          }
          else
          {
            close--;
          }

          if(open<0 || close <0)
          {
            return false;
          }

        }
        return true;
    }
}