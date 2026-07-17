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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode temp=head,r=null;
        int c=0,i=1;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        k=k%c;
        if(k==0) return head;
        c-=k;
        temp=head;

        while(i<c){
            temp=temp.next;
            i++;
        }
        r=temp.next;
        
        temp.next=null;
        temp=head;
        head=r;
        while(r.next!=null) r=r.next;

        r.next=temp;
        return head;
    }
}