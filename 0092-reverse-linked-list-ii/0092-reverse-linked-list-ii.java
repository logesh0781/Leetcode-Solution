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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode r=new ListNode(0);
        r.next=head;
        ListNode temp=head;
        ListNode prev=r,c=null,tail=null;
        for(int i=1;i<left;i++){
            prev=temp;
            temp=temp.next;
        }
        c=temp;
        temp=temp.next;
        c.next=null;
        tail=c;
        for(int i=left+1;i<=right;i++){
            prev.next=temp;
            temp=temp.next;
            prev.next.next=c;
            c=prev.next;
        }
        if(temp!=null) tail.next=temp;
        return r.next;
    }
}