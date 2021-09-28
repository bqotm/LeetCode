public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //detect cycle
    public boolean hasCycle(ListNode head) {
        ListNode p=head,q=head;
        if(head==null)
            return false;
        while(p!=null && q!=null){
            p=p.next;
            q=q.next.next;
            if(p==q)
                return true;
        }
        return false;
    }

    //return starting node of cycle
    public ListNode detectCycle(ListNode head) {
        ListNode p=head,q=head;
        if(head==null)
            return null;
        while(p!=null && q!=null && q.next!=null){
            p=p.next;
            q=q.next.next;
            if(p==q){
                q=head;
                while(p!=q){
                    p=p.next;
                    q=q.next;
                }
                return p;
            }
        }
        return null;
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        head.next=removeElements(head.next, val);
        if(head.val==val)
            return head.next;
        return head;
    }

    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode curr=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return curr;
    }

    public static void printLinkedList(ListNode head){
        if(head==null)
            return;
        System.out.print(head.val+" ");
        printLinkedList(head.next);
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        printLinkedList(head);
        ListNode n=reverseList(head);
        System.out.println();
        printLinkedList(n);
    }
}
