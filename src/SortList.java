import java.util.Comparator;
import java.util.PriorityQueue;

public class SortList {


    
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> priorityQueue=new PriorityQueue<>(Comparator.comparingInt(a->a.val));
        while(head!=null){
            priorityQueue.add(head);
            head=head.next;
        }
        ListNode res=new ListNode(0),curr=res;
        while(!priorityQueue.isEmpty()){
            curr.next=new ListNode(priorityQueue.poll().val);
            curr=curr.next;
        }

        return res.next;
    }


}
