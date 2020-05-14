package code514;

public class MyStack {
       private int[]arr;
       private  int top=0;

        /** Initialize your data structure here. */
        public MyStack(int k) {
         this.arr=new int[k];
        }

        /** Push element x onto stack. */
        public void push(int x) {
        arr[top++]=x;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
           return arr[--top];
        }

        /** Get the top element. */
        public int top() {

            return arr[top-1];
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
           if (top==0){
               return true;
           }
           return false;
        }

}
