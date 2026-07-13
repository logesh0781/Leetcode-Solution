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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = null;
        if (head.next == null)
            return temp;
        int c = 0, i = 1;
        temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        c -= n;
        temp = head;
        if(c==0) head=temp.next;
        else{
        while (i < c) {
            temp = temp.next;
            i++;
        }
        if (temp.next.next != null)
            temp.next = temp.next.next;
        else
            temp.next = null;
        }
        return head;
    }
}