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
    ListNode D(ListNode head,int val){
       if(head.val==val) {
           if(head.next==null){
           head=null;
           return head;}
           head=head.next;
           return head;
       }
        ListNode t=head.next,p=head;
        while(t!=null){
            if(t.val==val){
                if(t.next==null){p.next=null;
                                 return head;}
                p.next=t.next;
            }
            p=t;
            t=t.next;
        }
        return head;
        
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode t=head;
        int c=0;
        while(t!=null){
            if(t.val==val) c++;;
            t=t.next;
        }
         for(int i=1;i<=c;i++) head=D(head,val);
        return head;
    }
}