public class AddTwoNumbers {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum=new ListNode(0,null);//dummy node
        int x=0;
        ListNode head=sum;
        while(l1!=null && l2!=null){
            sum.next=new ListNode((x+l1.val+ l2.val)%10, null );
            x=(x+l1.val+l2.val)/10;
            l1=l1.next;
            l2=l2.next;
            sum=sum.next;
        }
        while (l1!=null){
            sum.next=new ListNode((x+l1.val)%10, null);
            x=(x+l1.val)/10;
            l1=l1.next;
            sum=sum.next;
        }
        while (l2!=null){
            sum.next=new ListNode((x+l2.val)%10, null);
            x=(x+l2.val)/10;
            l2=l2.next;
            sum=sum.next;
        }
        if(x==1)
            sum.next=new ListNode(1,null);
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2,null);
        l1.next=new ListNode(4,null);
        l1.next.next=new ListNode(3,null);

        ListNode l2=new ListNode(5,null);
        l2.next=new ListNode(6,null);
        l2.next.next=new ListNode(4,null);

        ListNode res=addTwoNumbers(l1,l2);
        System.out.println(res.val);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
        System.out.println(res);
    }
}
