public class MiddleOfLinkedList {





    public ListNode middleNode(ListNode head) {
        ListNode p,q;
        p=q=head;
        while(q.next!=null && q.next.next!=null){
            q=q.next.next;
            p=p.next;
        }
        if(q.next!=null)
            return p.next;
        return p;

    }



}
