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
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode ptr = head;
        int n = 1;
        while(ptr.next != null){
            n++;
            ptr = ptr.next;
        }        
        ptr.next = head;
        ptr = head;
        int x = n-k % n-1;
        for(int i = 0; i < x; i++){
            ptr = ptr.next;
        }
        ListNode hd = ptr.next;
        ptr.next = null;

        return hd;
    }
}