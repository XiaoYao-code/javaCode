package code514;

import java.util.Stack;

public class MinStack {

    Stack<Integer> minStack=new Stack<>();//最小栈
    Stack<Integer> helpStack=new Stack<>();//辅助栈

    public MinStack() {
       this.minStack=new Stack<>();//最小栈
        this.helpStack=new Stack<>();//辅助栈
    }

    public void push(int x) {  //把一个值放入栈中
        this.minStack.push(x);//一定把这个元素放入最小栈中
        if (this.helpStack.empty()||this.helpStack.peek()>=x){//如果辅助栈为空或者辅助栈顶值大于等于x则，把x放入辅助栈中
            this.helpStack.push(x);
        }else {//如果不为空，且x大于辅助栈顶值 那么把辅助栈顶值再放到辅助栈中一次
            this.helpStack.push(this.helpStack.peek());
        }
    }

    public void pop() {//删除栈顶
       if (!this.minStack.empty()||!this.helpStack.empty()){
           this.minStack.pop();
           this.helpStack.pop();
       }
    }
class employee{
        int id;
        int zhongyaodu;
        int lowid;
}
    public int top() {//得到栈顶元素
            if (!this.minStack.empty()){
                return this.minStack.peek();
            }
        throw  new RuntimeException("栈为空，操作非法");
    }

    public int getMin() {  //得到栈的最小值
        if (!this.minStack.empty()||!this.helpStack.empty()){
            return this.helpStack.peek();
        }
        throw  new RuntimeException("栈为空，操作非法");
    }
}
