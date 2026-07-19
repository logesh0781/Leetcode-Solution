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
    public ListNode reverseKGroup(ListNode head, int k) {
        int i=1,count=0;
        ListNode r=new ListNode(0);
        ListNode h=r;
        ListNode tail=null, current=null,temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        while(temp!=null){
            if(count>=k){
            if(i==1){
                r.next=temp;
                temp=temp.next;
                r.next.next=null;
                current=r.next;
                tail=current;
                i++;
            }
            else if(i<=k){
                r.next=temp;
                temp=temp.next;
                r.next.next=current;
                current=r.next;
                i++;
            }
            else {
                count-=k;
                i=1;
                r=tail;
            }}
            else{
                r.next=temp;
                break;
            }
        }
        return h.next;
    }
}