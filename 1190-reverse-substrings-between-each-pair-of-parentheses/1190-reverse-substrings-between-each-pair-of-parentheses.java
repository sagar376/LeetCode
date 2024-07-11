// class Solution {
//     public String reverseParentheses(String s) {

//         Stack<Integer> openBrackets=new Stack<>();
//         StringBuilder result=new StringBuilder();

//         for(char currentChar:s.toCharArray()){
//             if(currentChar=='(')
//             {
//                 openBrackets.push(result.length());
//             }
//             else if(currentChar==')')
//             {
//                 int start=openBrackets.pop();
//                 reverse(result,start,result.length()-1);
//             }
//             else
//             {
//                 result.append(currentChar);
//             }
//         }
//         return result.toString();
        
//     }
//     public void reverse(StringBuilder sb,int start,int end)
//     {
//         while(start<end)
//         {
//             char temp=sb.charAt(start);
//             sb.setCharAt(start++,sb.charAt(end));
//             sb.setCharAt(end--,temp);
//         }
//     }
// }

// Method - 2
class Solution {
     public String reverseParentheses(String s) {
        int len=s.length();
        Stack<Integer> openBracketIndices=new Stack<>();
        int[] pair=new int[len];

    // first pass to track for open & corresponding closing brackets
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='(')
            {
                openBracketIndices.push(i);
            }
            else if(s.charAt(i)==')')
            {
                int index=openBracketIndices.pop();
                pair[i]=index;
                pair[index]=i;
            }
        }

        //second pass to reverse the string with worm hole technique
        int direction=1;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<len;i+=direction)
        {
            if(s.charAt(i)=='(' || s.charAt(i)==')')
            {
                i=pair[i];
                direction=-direction;
            }
            else
            {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
     }
}


