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
    ListNode res = null;

    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }

    ListNode temp1 = list1;
    ListNode temp2 = list2;

    // res = new ListNode(Math.max(list1.val, list2.val), null);// first node
    if (list1.val <= list2.val) {
      res = temp1;
      temp1 = temp1.next;

    } else {
      res = temp2;
      temp2 = temp2.next;
    }

    ListNode head = res;

    while (temp1 != null && temp2 != null) {
      if (temp1.val <= temp2.val) {
        res.next = temp1;
        temp1 = temp1.next;
      } else {
        res.next = temp2;
        temp2 = temp2.next;
      }

      res = res.next;
    }

    if (temp1 != null) {
      res.next = temp1;
      temp1 = temp1.next;
      res = res.next;
    }

    if (temp2 != null) {
      res.next = temp2;
      temp2 = temp2.next;
      res = res.next;
    }

    return head;
  }

    public ListNode mergeKLists(ListNode[] lists) {

    int len = lists.length;
    if(len==0) return null;

    for (int i = 1; i < len; i++) {
      lists[i] = mergeTwoLists(lists[i - 1], lists[i]);
    }
    return lists[len - 1];
  }
}
