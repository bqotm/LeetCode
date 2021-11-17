public class RemoveDuplicatesfromSortedList {




    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)  return null;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode curr=dummy;
        while (curr.next.next!=null){
            if(curr.next.val==curr.next.next.val){
                curr.next=curr.next.next;
            } else {
                curr=curr.next;
            }
        }
        return dummy.next;
    }







}
