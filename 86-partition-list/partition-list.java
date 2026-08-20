class Solution {
    public ListNode partition(ListNode head, int x) {

        // Dummy nodes:
        // They make it easy to build both lists
        // without worrying about the first node.
        ListNode smallDummy = new ListNode();
        ListNode largeDummy = new ListNode();

        // These pointers move and build the two lists.
        ListNode small = smallDummy;
        ListNode large = largeDummy;

        // curr = READ pointer.
        // It scans every node in the original linked list.
        ListNode curr = head;

        while (curr != null) {

            if (curr.val < x) {

                // Node belongs to the SMALL list.
                // smallDummy.next will eventually be
                // the smallHead.
                small.next = curr;
                small = small.next;

            } else {

                // Node belongs to the LARGE list.
                // largeDummy.next will eventually be
                // the largeHead.
                large.next = curr;
                large = large.next;
            }

            // READ pointer always moves to the next node.
            curr = curr.next;
        }

        // Connect the two lists:
        //
        // smallHead → nodes < x
        // largeHead → nodes >= x
        //
        // So:
        // [ small list ] → [ large list ]
        small.next = largeDummy.next;

        // The large list must end here.
        // Otherwise, an old next pointer could create
        // an incorrect connection/cycle.
        large.next = null;

        // Skip the dummy node.
        // smallDummy.next is the real smallHead.
        return smallDummy.next;
    }
}