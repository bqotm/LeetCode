public class SwapNodesinPairs {



    public ListNode swapPairs(ListNode head) {
        if(head.next==null)
            return head;
        ListNode curr=head.next;
        head.next=swapPairs(head.next.next);
        curr.next=head;
        return curr;
    }

    /*public static void swap(ListNode head) {
        ListNode curr = head.next;
        head.next = ahead.next.next;
        curr = head;
    }*/


}
