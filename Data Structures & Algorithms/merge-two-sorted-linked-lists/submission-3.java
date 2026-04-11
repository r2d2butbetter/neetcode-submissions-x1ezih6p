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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode head;
        if(temp1.val<temp2.val) {
            head = temp1;
            temp1 = temp1.next;
        }
        else{
            head = temp2;
            temp2 = temp2.next;
        }

        ListNode res=head;

        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                res.next = temp1;
                temp1 = temp1.next;
                res = res.next;
            }
            else
            {
                res.next = temp2;
                temp2 = temp2.next;
                res = res.next;
            }
        }

        if(temp1!=null)
        {
            res.next = temp1;
        }
        
        if(temp2!=null)
        {
            res.next = temp2;
        }
        return head;
    }
}