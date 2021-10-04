public class SwappingNodesinaLinkedlist {


    public ListNode swapNodes(ListNode head, int k) {

        ListNode p=head;
        ListNode q=head;
        ListNode first, second;
        for(int i=1; i<k ;++i){
            q=q.next;
        }
        first=q;
        while(q.next!=null){
            p=p.next;
            q=q.next;
        }
        if(p==first)
            return head;
        second=p;
        //swap vals instead of actual nodes
        int dummy=first.val;
        first.val=second.val;
        second.val=dummy;
        return head;
    }



}
