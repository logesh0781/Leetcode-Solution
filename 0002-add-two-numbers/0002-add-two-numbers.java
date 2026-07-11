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
        int total,carry=0;
        ListNode tail=null,head=null;

        while(l1!=null || l2!=null){
            if(l1==null){
                total=l2.val+carry;
                l2=l2.next;}
            else if(l2==null){
                total=l1.val+carry;
                l1=l1.next;}
            else{
                total=l1.val+l2.val+carry;
                l1=l1.next;
                l2=l2.next;
            }
            ListNode r=new ListNode(total%10);
            if(head==null){
                head=r;
                tail=r;
                }
            else{
                tail.next=r;
                tail=r;
            }
            carry=total/10;
            
        }
        if(carry!=0){
            ListNode r=new ListNode(carry);
            tail.next=r;
        }
        
        return head;
    }
}