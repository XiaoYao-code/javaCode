package code420;

import java.util.Arrays;

public class MyArrayList {
    public int []arr;//定义一个数组
    public int usedSize;//数组存放数据计数器
    public static final int intCapacity=10;  //数组长度
    public MyArrayList(){
        this.arr=new int[intCapacity];
        this.usedSize=0;
    }

    //打印顺序表display
    public void disPlay(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }
    //（设置一个方法判断pos位置是否合法)
    private boolean judgePos(int pos){
      /*  if (0>pos||pos>=this.usedSize){
            return false;
        }
        return true;*/
      return 0>pos||pos>=this.usedSize;
    }
    //判断数组是否已经满，满则扩容2倍
    private boolean isFull(){
      /*  if (this.usedSize==this.arr.length){
            return true;
        }
        return false;*/
        return this.usedSize==this.arr.length;
    }
    //在pos位置新增一个元素data
    public void add(int pos,int data){
        judgePos(pos);
        if(isFull()) {
            this.arr =
                    Arrays.copyOf(this.arr,2*this.arr.length);
        }
        for (int i = this.usedSize-1; i >=pos ; i--) {
              this.arr[i+1]= this.arr[i];
        }
        this.arr[pos]=data;
        this.usedSize++;
    }
    //判断是否包含元素toFind
    public boolean contain(int toFind){
        for (int i = 0; i <this.usedSize; i++) {
                if (this.arr[i]==toFind){
                    return true;
                }
        }
        return false;
    }
    //输出某个元素toFind的下标
    public int search(int toFind){
        for (int i = 0; i <this.usedSize; i++) {
            if (this.arr[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    //顺序表是否为空
    private boolean isNull(){
        /*if (this.usedSize==0){
            return false;
        }
        return true;*/
        return this.usedSize==0;
    }
    //获取pos位置的元素
    public int getPos(int pos) {
        //  JudgePos(pos);//不能使用判断函数因为返回值为bool类型，而GetPos函数的返回值为int类型，judgepos返回值会被忽略
        //1、顺序表是否为空   -1
        if (isNull()) {
            throw new RuntimeException("顺序表为空！");//手动抛出异常
        }
        //2、pos 合法性
        if (judgePos(pos)) {
            throw new RuntimeException("pos位置不合法!");
        }
        return  this.arr[pos];
    }
    //将pos位置上的元素替换为value
   public void setPos(int pos,int value){
       if (judgePos(pos)) {
           throw new RuntimeException("pos位置不合法!");
       }
       this.arr[pos]=value;
   }
    //删除第一个出现的关键字key
    public void remove(int key){
        if (!contain(key)){
            System.out.println("没有需要删除的数据");
        }
        int index=search(key);
        for (int i = index; i <this.usedSize-1 ; i++) {
            this.arr[i]=this.arr[i+1];
        }
        this.usedSize--;
    }
    //获取顺序表长度
    public int getSize(){
        return this.usedSize;
    }
    //清空顺序表
    public void clear(){
        this.usedSize=0;
    }
}
