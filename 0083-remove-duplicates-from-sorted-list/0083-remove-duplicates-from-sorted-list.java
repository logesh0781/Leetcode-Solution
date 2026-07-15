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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode temp=head,f=head.next;
        while(f!=null){
            if(temp.val==f.val){
                if(f.next==null){
                    temp.next=null;
                    return head;
                }
                f=f.next;
                temp.next=f;
                continue;
            }
            temp=f;
            f=f.next;        
        }
        return head;
    }
}