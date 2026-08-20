class Solution {
    public ListNode partition(ListNode head, int x) {

        // Dummy nodes:
        // They make it easy to build both lists
        // without worrying about the first node.
        ListNode smallDummy = new ListNode();
        ListNode largeDummy = new ListNode();

        // Pointers used to build the two lists.
        ListNode small = smallDummy;
        ListNode large = largeDummy;

        // curr = READ pointer.
        // It scans every node in the original linked list.
        ListNode curr = head;

        while (curr != null) {

            if (curr.val < x) {

                // Node belongs to the SMALL list.
                small.next = curr;
                small = small.next;

            } else {

                // Node belongs to the LARGE list.
                large.next = curr;
                large = large.next;
            }

            // READ pointer always moves to the next node.
            curr = curr.next;
        }

        // Connect the SMALL list to the LARGE list.
        small.next = largeDummy.next;

        // End the LARGE list.
        // This prevents an old next pointer from creating
        // an incorrect connection or cycle.
        large.next = null;

        // Skip the dummy node and return the actual result list.
        return smallDummy.next;
    }
}
