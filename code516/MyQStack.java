package code516;

import java.util.LinkedList;
import java.util.Queue;

public class MyQStack {
     private Queue<Integer>queue1;
     private Queue<Integer>queue2;

    /** Initialize your data structure here. */
    public MyQStack() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (empty()){//如果两个队列都为空，那么放入queue中
            queue1.add(x);
        }else if (!queue1.isEmpty()){//如果queue1不为空那么添加到queue1
            queue1.add(x);
        }else {
            queue2.add(x);//如果queue2不为空那么添加到queue2
        }

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (empty()){//如果两个队列都为空，那么返回-1；
            return -1;
        }else
        if (!queue1.isEmpty()){
            while (queue1.size()>1){
                int data=queue1.poll();
                queue2.add(data);
            }
            return queue1.poll();
        }else {
            while (queue2.size()>1){
                int data=queue2.poll();
                queue1.add(data);
            }
            return queue2.poll();

        }
    }

    /** Get the top element. */
    public int top() {
        if (empty()){//如果两个队列都为空，那么返回-1；
            return -1;
        }else
        if (!queue1.isEmpty()){
            while (queue1.size()>0){
                int data=queue1.poll();
                queue2.add(data);
            }
            return queue2.peek();
        }else {
            while (queue2.size()>0){
                int data=queue2.poll();
                queue1.add(data);
            }
            return queue1.peek();

        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (queue1.isEmpty()&&queue2.isEmpty()){//如果两个队列都为空，那么返回-1；
            return true;
        }
        return false;
    }
}
