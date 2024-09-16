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
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode ptr = head;
        ListNode pre = dummy;
        while(ptr != null){
            if(ptr.next != null && ptr.val == ptr.next.val){
                while(ptr.next != null && ptr.val == ptr.next.val){
                    ptr = ptr.next;
                }
                pre.next = ptr.next;
                ptr = ptr.next;
            }
            else{
                pre = ptr;
                ptr = ptr.next;
            }
            
        }
        return dummy.next;
    }
}