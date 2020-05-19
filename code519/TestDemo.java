package code519;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
    }
}
public class TestDemo {
    //给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。


    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();//用一个队列帮助是实现  先进先出
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)  //如果为空则返回null
            return list;
        queue.offer(root);//把根节点放到队列当中
        while (!queue.isEmpty()) {
            List<Integer> list1 = new ArrayList<>();
            int size = queue.size();//得到当前的队列长度第一层 为1，第二层为2，第三层为4
            while (size > 0) {
                Node cur = queue.poll();
                if (cur != null) {
                    list1.add(cur.val);
                    if (cur.left != null) {  //如果该节点的左右不等于null那么把它的左右节点储存到队列中
                        queue.offer(cur.left);
                    }
                    if (cur.right != null) {
                        queue.offer(cur.right);
                    }
                    size--;//控制list1中放入的元素个数
                }
            }
            list.add(list1);//把每一层循环结束后的的list1放入list当中
        }
        return list;//返回list
    }


    //判断一个二叉树是不是完全二叉树
   public  boolean isCompleteTree(Node root){
        if (root==null){
            return true;
        }
        Queue<Node> list=new LinkedList<>();
        list.offer(root);//如果根节点不为空，放入队列
        while (!list.isEmpty()){
            Node cur=list.poll();//移除队头元素，判断队头元素
            if (cur!=null) {
                list.offer(cur.left);//左右节点放入队列
                list.offer(cur.right);
            }else {
                while (!list.isEmpty()){//如果队列中有null那么判断，队列中是不是还有不为null的元素，如果有说明不是完全二叉树，如果都为空那么则是完全二叉树
                    Node cur1=list.poll();//每次移除栈顶元素判断是否为空
                    if (cur1!=null)//不为空则返回的是false
                        return false;
                }
            }
        }
        return true;//代码能运行到该行，则说明出现null，开始检查队列中是否有不为空的元素，没有不为空的元素，则是完全二叉树

   }
}
