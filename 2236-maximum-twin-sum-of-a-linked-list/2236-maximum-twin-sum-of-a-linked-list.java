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

    private static ListNode rev(ListNode node){
        ListNode pre = null;
        ListNode curr = node;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;

            curr.next = pre;

            pre = curr;
            curr = next;
        }
        return pre;
    }
    public int pairSum(ListNode head) {
        if(head.next == null){
            return head.val;
        }
        else if(head.next.next == null){
            return (head.val + head.next.val);
        }
        int n = 0, max = 0;
        ListNode ptr = head;
        while(ptr != null){
            n++;
            ptr = ptr.next;
        }
        ptr = head;
        ListNode pre = null;
        for(int i = 0; i < n/2; i++){
            pre = ptr;
            ptr = ptr.next;
        }
        pre.next = null;
        ptr = rev(ptr);
        while(ptr != null){
            int sum = head.val + ptr.val;
            max = Math.max(max, sum);
            ptr = ptr.next;
            head = head.next;
        }

        return max;
    }
}