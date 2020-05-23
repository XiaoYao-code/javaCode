package code523;

import java.util.Arrays;

public class Main {

    public class TestHeap {


        public int[] elem;
        public int usedSize;

        public TestHeap() {
            this.elem = new int[10];
        }


        public void adjustDown(int root, int len) {
            int parent = root;
            int child = 2 * parent + 1;
            while (child < len) {

                if (child + 1 < len) {
                    if (this.elem[child] > this.elem[child + 1]) {
                        child += 1;
                    }
                }

                if (this.elem[child] > this.elem[parent]) {
                    //交换
                    int tmp = this.elem[child];
                    this.elem[child] = this.elem[parent];
                    this.elem[parent] = tmp;
                    parent = child;
                    child = parent * 2 + 1;
                } else {
                    break;
                }
            }


        }

        public void createHeap(int[] array) {
            for (int i = 0; i < array.length; i++) {
                this.elem[i] = array[i];
                this.usedSize++;
            }

            for (int i = (this.usedSize - 1 - 1) / 2; i >= 0; i--) {
                adjustDown(i, this.usedSize);
            }


        }

        public void show() {
            for (int i = 0; i < this.usedSize; i++) {
                System.out.println(this.elem[i] + " ");
            }
        }

        public void push(int val) {

            if (isFull()) {
                this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
            }

            val = this.elem[this.usedSize];

            adjustUp(this.usedSize);
            this.usedSize++;
        }

        public void adjustUp(int child) {
            int parent = (child - 1) / 2;
            while (child > 0) {
                if (this.elem[child] > this.elem[parent]) {
                    int tmp = this.elem[child];
                    this.elem[child] = this.elem[parent];
                    this.elem[parent] = tmp;
                    child = parent;
                    parent = (child - 1) / 2;
                } else {
                    break;
                }
            }
        }

        public boolean isFull() {
            return this.usedSize == this.elem.length;
        }

        public void pop() {
            //判断为空
            if (isEmpty()) {
                return;
            }
            int tmp = this.elem[0];
            this.elem[0] = this.elem[this.usedSize - 1];
            this.elem[this.usedSize - 1] = tmp;
            this.usedSize--;
            adjustDown(0, this.usedSize);

        }

        public boolean isEmpty() {
            if (this.usedSize == 0) {
                return true;
            }
            return false;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return this.elem[0];

        }

        public void heapSort() {//堆排序
            int end = this.usedSize - 1;
            while (end > 0) {
                int tmp = this.elem[0];
                this.elem[0] = this.elem[end];
                this.elem[end] = tmp;
                adjustDown(0, end--);
            }
        }
    }
}
