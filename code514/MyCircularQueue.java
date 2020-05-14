package code514;

public class MyCircularQueue {
    private int[]arr;
    private int front=0;//循环队列头部
    private int rear=0;//循环队列尾部

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
         this.arr=new int[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()){
            return false;//判断是否满，如果满则不放入
        }
        this.arr[this.rear] = value;//利用尾部放入元素
        this.rear = (this.rear+1)%this.arr.length;//循环队列 要始终得到0-length-1的下标，那么利用对length取模就可以得到。
        return true;

    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()){//删除头部元素
            return false;
        }
          this.front=(front+1)%this.arr.length;//直接让头部下标+1即可，下次的值会覆盖当前值
          return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()){    //返回头部元素的值
            return -1;
        }
       return this.arr[this.front%this.arr.length];
    }

    /** Get the last item from the queue. */
    public int Rear() { //返回尾部元素的值
        if (isEmpty()){
            return -1;
        }
        int index = this.rear == 0 ? this.arr.length-1 : this.rear-1;//三目运算符，如果尾部为0那么最后一个元素值得下标
                                                      // 应该为length-1；因为尾部始终标志着可以放元素得位置

        return this.arr[index];

    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {          //头尾重叠则队列为空
            return front==rear;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {       //循环列表规定：舍弃一个空间，如果尾部得下一个值为头部那么标志着循环队列为满
          return (this.rear+1)%arr.length==this.front%arr.length;
    }
}
