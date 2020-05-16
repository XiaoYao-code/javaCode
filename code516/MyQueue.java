package code516;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
         stack1.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (empty()){
            return -1;
        }
        int data=0;
        if (stack2.empty()){
            while (!stack1.empty()){
              data=stack1.pop();
              stack2.add(data);
            }
            return stack2.pop();
        }else {
              return stack2.pop();
        }

    }

    /** Get the front element. */
    public int peek() {
        if (empty()){
            return -1;
        }
        int data=0;
        if (stack2.empty()){
            while (!stack1.empty()){
                data=stack1.pop();
                stack2.add(data);
            }
            return stack2.peek();
        }else {
            return stack2.peek();
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
      if (stack1.empty()&&stack2.empty()){
          return true;
      }
      return false;
    }
}
