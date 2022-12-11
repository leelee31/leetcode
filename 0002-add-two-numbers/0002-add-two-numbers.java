import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();
        reverse(l1, sb);
        BigInteger val1 = new BigInteger(sb.toString());
        sb = new StringBuilder();
        reverse(l2, sb);
        String sum = new BigInteger(sb.toString()).add(val1) + "";
        ListNode result = new ListNode();
        ListNode temp = result;
        for (int i = sum.length() - 1; i>= 0; i--) {
            temp.val = sum.charAt(i) - '0';
            if (i != 0) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return result;
    }

    public void reverse(ListNode list, StringBuilder s) {
        if (list == null) return;
        reverse(list.next, s);
        s.append(list.val);
    }
}