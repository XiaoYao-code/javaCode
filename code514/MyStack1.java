package code514;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack1 {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /**
     * Initialize your data structure here.
     */
    public MyStack1() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {//
        if (!this.queue1.isEmpty()) {
            this.queue1.add(x);
        } else if (!this.queue2.isEmpty()) {
            this.queue2.add(x);
        } else {
            this.queue1.add(x);
        }

    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        if (!queue1.isEmpty()) {
            while (queue1.size() != 1) {
                queue2.add(queue1.poll());

            }
            return queue1.poll();
        } else {
            while (queue2.size() != 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();

        }
    }

    public int top() {
        int data = 0;
        if (empty()) {
            return -1;
        }

        if (!queue1.isEmpty()) {
            while (queue1.size() != 0) {
                data = queue1.poll();
                queue2.add(data);
            }

        } else {
            while (queue2.size() != 0) {
                data = queue2.poll();
                queue1.add(data);
            }

        }
        return data;
    }

    public boolean empty() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }


}
