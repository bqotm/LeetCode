import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {




    class MyStack {

        Queue<Integer> queue1;
        Queue<Integer> queue2;

        public MyStack() {
            queue1=new LinkedList<>();
            queue2=new LinkedList<>();
        }

        public void push(int x) {
            if(queue2.isEmpty() && queue1.isEmpty()){
                queue1.add(x);
                return;
            }
            else if(queue2.isEmpty()){
                queue2.add(x);
                while(!queue1.isEmpty()){
                    queue2.add(queue1.poll());
                }
                return;
            } else if(queue1.isEmpty()) {
                queue1.add(x);
                while(!queue2.isEmpty()){
                    queue1.add(queue2.poll());
                }
                return;
            }
        }

        public int pop() {
            return (queue2.isEmpty()) ? queue1.poll() : queue2.poll();
        }

        public int top() {
            return (queue2.isEmpty()) ? queue1.peek() : queue2.peek();
        }

        public boolean empty() {
            return (queue2.isEmpty() && queue1.isEmpty());
        }
    }






}
