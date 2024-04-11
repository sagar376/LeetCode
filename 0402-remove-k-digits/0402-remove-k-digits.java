import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k)
            return "0";

        Stack<Character> stack = new Stack<>();
        // Iterate over the characters of the input string
        for (char digit : num.toCharArray()) {
            // Remove digits from the stack as long as the current digit is smaller and k > 0
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // Remove remaining digits from the end of the stack if k > 0
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Construct the result string from the remaining digits in the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop()); // Insert at the beginning to maintain the correct order
        }

        // Remove leading 0's
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
