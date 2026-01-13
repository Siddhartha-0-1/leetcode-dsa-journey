package linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class removeNthnodeFromTheList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete nth node from end
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Test
    public static void main(String[] args) {

        ListNode head = new ListNode(1,
                            new ListNode(2,
                            new ListNode(3,
                            new ListNode(4,
                            new ListNode(5)))));

        head = removeNthFromEnd(head, 2);

        // Print list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
