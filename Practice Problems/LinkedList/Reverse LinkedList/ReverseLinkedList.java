class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;

        ListNode reversedNode = reverseList(node1);
        while (reversedNode != null) {
            System.out.print(reversedNode.val + "->");
            reversedNode = reversedNode.next;
        }
        System.out.print("NULL");
    }
}
