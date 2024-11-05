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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> a - b);
        if(lists == null || lists.length == 0)
            return null;
        for(int i = 0; i < lists.length; i++){
            ListNode cur = lists[i];
            while(cur != null){
                heap.add(cur.val);
                cur = cur.next;
            }
        }

        return getHead(heap);
    }

    private ListNode getHead(PriorityQueue<Integer> heap){
        if (heap.isEmpty()) {
            return null;
        }
        ListNode head = new ListNode(heap.poll());
        ListNode cur = head;
        while(!heap.isEmpty()){
            cur.next = new ListNode(heap.poll());
            cur = cur.next;
        }

        return head;
    }
}