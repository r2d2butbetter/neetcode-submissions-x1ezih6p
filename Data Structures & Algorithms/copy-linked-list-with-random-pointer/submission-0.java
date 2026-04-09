/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> old = new HashMap<>();
        old.put(null, null);

        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);

            old.put(curr, copy);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            Node copy = old.get(curr);
            copy.next = old.get(curr.next);
            copy.random = old.get(curr.random);

            curr = curr.next;
        }

        return old.get(head);
    }
}
