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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        int temp;
        ListNode one=head,two=head;
        while(one!=null && one.next!=null){
            two=one.next;
            temp=one.val;
            one.val=two.val;
            two.val=temp;
            one=two.next;
        }
        return head;
    }
}