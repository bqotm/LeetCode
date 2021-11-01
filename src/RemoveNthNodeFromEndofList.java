public class RemoveNthNodeFromEndofList {



    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p,q;
        p=q=head;
        for (int i = 0; i < n; i++) {
            q=q.next;
        }
        if(q==null)
            return head.next;
        while(q.next!=null){
            q=q.next;
            p=p.next;
        }
        p.next=p.next.next;
        return head;
    }


}
