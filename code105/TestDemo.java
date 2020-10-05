package code419;

import java.util.Arrays;

public class TestDemo {
        public int[] elem;//数组
        public int usedSize;//有效的数据个数
        public static final int intCapacity = 10;//初始容量

        public TestDemo() {
            this.elem = new int[intCapacity];
            this.usedSize = 0;
        }
        public void add(int pos,int data){
            if (pos>=0&&pos<usedSize){
                int i=usedSize-1;
                while (i>=pos){
                this.elem[i+1]=this.elem[i];
                i--;
                }
                this.elem[pos]=data;
            }
            this.usedSize++;
        }
        public void display(){
            System.out.println(Arrays.toString(this.elem));
        }
        public boolean contains(int toFind){
            for (int x: this.elem) {
                  if(x==toFind);
                  return  true;
            }
            return false;
        }
        public int Search(int toFind){
            for (int x: this.elem) {
                if(x==toFind);
                return  x;           ////////错误 foreach  不能遍历下标
            }
            return -1;
         }
         public int getPos(int pos){
            if (this.usedSize<=0||pos>=this.usedSize){
                return -1;
            }
            return this.elem[pos];
         }
         public int size(){
            return this.usedSize;
         }
         public void remove(int Remove){
             for (int i = 0; i <this.usedSize-1 ; i++) {
                 if (this.elem[i]==Remove){
                     break;
                 }
                 if (i==this.usedSize-1){
                     System.out.println("未找到Remove");
                 }else{
                     for (int j =i ; j <this.usedSize-1 ; j++) {
                         this.elem[j]=this.elem[j+1];
                     }
                 }
                 this.usedSize--;
             }
         }
    }

