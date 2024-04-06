// import java.util.Stack;

// class Solution {
//     public String minRemoveToMakeValid(String s) {
//         StringBuilder sb = new StringBuilder(s);
//         Stack<Integer> st = new Stack<>();

//         for (int i = 0; i < sb.length(); i++) {
//             if (sb.charAt(i) == '(') {
//                 st.push(i);
//             } else if (sb.charAt(i) == ')') {
//                 if (!st.isEmpty()) {
//                     st.pop();
//                 } else {
//                     // Replace invalid closing parenthesis with an empty character
//                     sb.setCharAt(i, '*');
//                 }
//             }
//         }
        
//         // Mark unmatched opening parentheses as invalid
//         while (!st.isEmpty()) {
//             sb.setCharAt(st.pop(), '*');
//         }

//         // Remove all invalid characters marked with '*'
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < sb.length(); i++) {
//             if (sb.charAt(i) != '*') {
//                 result.append(sb.charAt(i));
//             }
//         }

//         return result.toString();
//     }
// }


//Method -2

class Solution {
    public String minRemoveToMakeValid(String s) {

        char[] arr = s.toCharArray();
        int open = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                open++;
            else if (arr[i] == ')') {
                if (open == 0)
                    arr[i] = '*';
                else
                    open--;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (open > 0 && arr[i] == '(') {
                arr[i] = '*';
                open--;
            }
        }

        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*')
                arr[p++] = arr[i];
        }

        return new String(arr).substring(0, p);
        
    }
}
