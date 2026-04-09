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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int size =0;
            ListNode temp = head;
            while (temp!=null) {
                size++;
                temp= temp.next;
            }

            int from_front = size-n; //this will be 0 indexed...

            if(from_front==0){
                return head.next;
            }

            ListNode prev = head;
            temp=head;

            for (int i = 0; i < from_front; i++) {
                prev = temp;
                temp = temp.next;
            }

            prev.next = temp.next;
            return head;
        }
}
    