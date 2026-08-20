class Solution {
    public ListNode reverseList(ListNode head) {

        // If list is empty or has only one node, it is already reversed
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead=reverseList(head.next);
        head.next.next=head;//1->2 to 1-><-2
        //1  //2      //1 
        head.next=null; //1-><-2 to 2<-1

        return newHead;
    }
}