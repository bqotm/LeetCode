import java.util.Stack;

public class ImplementQueueUsingStacks {


    class MyQueue {

        Stack<Integer> stack1;
        Stack<Integer> stack2;
        int top;
        public MyQueue() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        public void push(int x) {
            if(stack1.empty())
                top=x;
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            stack2.push(x);
            while(!stack2.empty()){
                stack1.push(stack2.pop());
            }
        }

        public int pop() {
            int a=stack1.pop();
            if(!stack1.empty())
                top=stack1.peek();
            return a;
        }

        public int peek() {
            return top;
        }

        public boolean empty() {
            return stack1.empty();
        }
    }


}


