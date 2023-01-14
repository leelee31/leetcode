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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int idx = 0;
        while (temp != null) {
            idx++;
            temp = temp.next;
        }
        int length = idx/2;
        temp = head;
        idx = 0;
        while (temp != null) {
            if (idx == length) return temp;
            idx++;
            temp = temp.next;
        }
        return null;
    }
}