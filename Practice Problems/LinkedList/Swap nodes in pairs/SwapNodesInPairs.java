class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode nextNode = second.next;
        second.next = first;
        first.next = swapPairs(nextNode);
        return second;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        swapPairs(node1);
        System.out.print(node2.val);
        while (node2.next != null) {
            node2 = node2.next;
            System.out.print("->" + node2.val);
        }
    }
}
