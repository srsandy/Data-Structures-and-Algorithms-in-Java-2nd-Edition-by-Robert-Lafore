class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        if (head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode rev = reverse(head, slow);
        if (fast != null) slow = slow.next;
        while (rev != null) {
            if (rev.val != slow.val) return false;
            rev = rev.next;
            slow = slow.next;
        }
        return true;

    }

    private static ListNode reverse(ListNode head, ListNode end) {
        ListNode front = head;
        ListNode back = head.next;
        while (back != end) {
            ListNode tmp = back.next;
            back.next = front;
            front = back;
            back = tmp;
        }
        head.next = null;
        return front;
    }

    public static void main(String[] args) {
        ListNode firstListNode1 = new ListNode(1);
        ListNode firstListNode2 = new ListNode(2);
        firstListNode1.next = firstListNode2;
        System.out.println(isPalindrome(firstListNode1));

        ListNode secondListNode1 = new ListNode(1);
        ListNode secondListNode2 = new ListNode(2);
        secondListNode1.next = secondListNode2;
        ListNode secondListNode3 = new ListNode(2);
        secondListNode2.next = secondListNode3;
        ListNode secondListNode4 = new ListNode(1);
        secondListNode3.next = secondListNode4;

        System.out.println(isPalindrome(secondListNode1));
    }
}
