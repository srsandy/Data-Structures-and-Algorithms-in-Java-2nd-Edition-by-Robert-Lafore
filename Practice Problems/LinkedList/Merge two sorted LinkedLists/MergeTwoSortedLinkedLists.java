class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class MergeTwoSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

        l1.next = mergeTwoLists(l1.next,l2);
        return l1;
    }

    public static void main(String[] args) {
        ListNode firstListNode1 = new ListNode(1);
        ListNode firstListNode2 = new ListNode(2);
        firstListNode1.next = firstListNode2;
        ListNode firstListNode3 = new ListNode(4);
        firstListNode2.next = firstListNode3;

        ListNode secondListNode1 = new ListNode(1);
        ListNode secondListNode2 = new ListNode(3);
        secondListNode1.next = secondListNode2;
        ListNode secondListNode3 = new ListNode(4);
        secondListNode2.next = secondListNode3;

        ListNode mergedListNode = mergeTwoLists(firstListNode1, secondListNode1);


        System.out.print(mergedListNode.val);
        mergedListNode = mergedListNode.next;
        while (mergedListNode != null) {
            System.out.print("->" + mergedListNode.val);
            mergedListNode = mergedListNode.next;
        }
    }
}
