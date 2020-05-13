package code513;

import java.util.Arrays;

public class Mystack  {
    public int[] elem;//数组
    public int top;//表示当前可以存放数据元素的下标

    public Mystack() {
        this.elem = new int[10];
    }

    public void push(int s) {
        if (top > elem.length) {
            this.elem =
                    Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        elem[top] = s;
        top++;
    }

    public boolean empty() {
        if (top == 0) {
            return false;
        }
        return true;
    }

    public boolean full() {
        if (top == elem.length) {
            return true;
        }
        return false;
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("栈空");
        }
        return elem[--top];
    }

    public int peek() {
        if (empty()) {
            throw new RuntimeException("栈空");
        }
        return elem[top - 1];
    }

    public int size() {
        return top;
    }
}


