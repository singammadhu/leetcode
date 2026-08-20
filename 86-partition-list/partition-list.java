class Solution {
    public ListNode partition(ListNode head, int x) {

        if (head == null) {
            return null;
        }

        // Temporary storage for the partitioned values.
        ArrayList<Integer> list = new ArrayList<>();

        ListNode curr = head;

        // First pass:
        // Scan the linked list and collect all values < x.
        while (curr != null) {

            if (curr.val < x) {
                // Value belongs to the LEFT partition.
                list.add(curr.val);
            }

            // Read pointer always moves to the next node.
            curr = curr.next;
        }

        // Second pass:
        // Start again from the head and collect
        // all values >= x.
        curr = head;

        while (curr != null) {

            if (curr.val >= x) {
                // Value belongs to the RIGHT partition.
                list.add(curr.val);
            }

            // Read pointer moves to the next node.
            curr = curr.next;
        }

        // Now list contains:
        // [ all values < x | all values >= x ]

        curr = head;
        int index = 0;

        // Write the partitioned values back
        // into the original linked list.
        while (curr != null) {

            curr.val = list.get(index++);

            // Move to the next node.
            curr = curr.next;
        }

        return head;
    }
}