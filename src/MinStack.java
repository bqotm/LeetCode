import java.util.ArrayList;
import java.util.List;

public class MinStack {

    class Node {
        int val,min;
        Node next;
        public Node(int val, int min, Node next){
            val=val;
            min=min;
            next=null;
        };
    }

    Node head;
    public MinStack() {
        head=null;
    }

    public void push(int val) {
        if(head==null){
            head=new Node(val, val, null);
        } else {
            head=new Node(val, Math.min(val, head.min), head);
        }
    }

    public void pop() {
        this.head=head.next;
    }

    public int top() {
        return this.head.val;
    }

    public int getMin() {
        return this.head.min;
    }
}
