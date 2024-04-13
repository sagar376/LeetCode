class Solution {
    public int maximalRectangle(char[][] matrix) {

//          but I just wanted to say what a genius question this is.

// Its one thing to be able to find the solution built on the solution of another problem (the largest histogram rectangle), its another level of creativity to come up with such a simple-looking question that uses that property (of having to use the other solution).

// Kudos to whoever came up with this. Real brain teaser :D

// Problem 84. Largest Rectangle in Histogram


if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols + 1]; // Include an extra element for easier calculation
        int maxArea = 0;

        for (char[] row : matrix) {
            for (int i = 0; i < cols; i++) {
                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
            }

            // Calculate max area using stack-based method
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < heights.length; i++) {
                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                    int h = heights[stack.pop()];
                    int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                    maxArea = Math.max(maxArea, h * w);
                }
                stack.push(i);
            }
        }

        return maxArea;
    }
}