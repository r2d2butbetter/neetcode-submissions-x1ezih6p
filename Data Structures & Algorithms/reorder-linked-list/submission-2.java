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

    public static ListNode reverseList(ListNode head)
    {
        if(head==null) return null;
        if(head.next==null) return head;

        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next=prev;
             
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static ListNode findmid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null && fast.next.next!=null) //last condition so we stay 1 pos behind
        {
            slow= slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reorderList(ListNode head) {
        
        ListNode temp = findmid(head);
        ListNode mid = temp.next;
        temp.next = null; //break connection
        mid = reverseList(mid);

        temp = head;
        //temp has start, mid has reversed half

        while(temp!=null && mid!=null)
        {
            ListNode l1Next = temp.next;
            ListNode l2Next = mid.next;

            temp.next = mid;
            mid.next = l1Next;

            temp = l1Next;
            mid = l2Next;
        }
    }
}
