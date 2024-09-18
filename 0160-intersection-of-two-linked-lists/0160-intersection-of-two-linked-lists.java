/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
            
        ListNode ptr = headA;
        ListNode ptrr = headB;
        while(ptr != ptrr){
            ptr = ptr == null? headB : ptr.next;
            ptrr = ptrr == null? headA : ptrr.next;
        }

        return ptr;
    }
}