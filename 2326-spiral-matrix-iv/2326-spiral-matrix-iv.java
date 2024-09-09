/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        ListNode curr = head;
        int value = 0;

        while (left <= right && top <= bottom) {
            if (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    if (curr != null) {
                        value = curr.val;
                        curr = curr.next;
                    } else {
                        value = -1;
                    }
                    result[top][i] = value;
                }
                top++;
            }

            if (left <= right && top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    if (curr != null) {
                        value = curr.val;
                        curr = curr.next;
                    } else {
                        value = -1;
                    }
                    result[i][right] = value;
                }
                right--;
            }

            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    if (curr != null) {
                        value = curr.val;
                        curr = curr.next;
                    } else {
                        value = -1;
                    }
                    result[bottom][i] = value;
                }
                bottom--;
            }

            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    if (curr != null) {
                        value = curr.val;
                        curr = curr.next;
                    } else {
                        value = -1;
                    }
                    result[i][left] = value;
                }
                left++;
            }
        }

        return result;
    }
}
