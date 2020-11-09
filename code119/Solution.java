package code119;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    static ArrayList<Node> list =new ArrayList<>();
    //前序遍历  根左右
    //中序遍历  左根右
    //后序遍历  左右根
     static Node KthNode1(Node pRoot, int k) {
         midTraversal(pRoot);
    if (k<=0||k>list.size())
        return null;
    return list.get(k-1);


    }
    static Node KthNode(Node pRoot, int k) {

        if (k<=0||pRoot==null)
            return null;  //合法性判断
        int index=0;//index用来判断是否是第k个元素
        Node tmp=pRoot;
        Stack<Node> stack=new Stack<>();  //利用栈的特点，核心思想就是先跑到最左边的节点，从该节点开始遍历
        while (!stack.empty()||tmp!=null){//循环跳出的条件必须是栈为空并且该节点已经是空节点了
            if (tmp!=null){
                stack.push(tmp);//始终把左节点放入栈
                tmp=tmp.left;
            }else {
                tmp=stack.pop();//如果没有左节点，则开始比较，如果当前节点index等于k，说明已经找到了。

                index++;
                if (index==k){
                    return  tmp;
                }
                tmp=tmp.right;//如果到这还没有返回，说明index还没有到达k个元素，需要比较当前节点的右孩子
            }
        }
          return  null; //不可能走到此语句

    }
public static void main(String[] args) {
    Node node1=new Node(5);
    Node node2=new Node(3);
    Node node3=new Node(7);
    node1.left=node2;
    node1.right=node3;
    midTraversal(node1);
    for (Node node:list) {
        System.out.println(node.val);
    }
    System.out.println(KthNode(node1, 1).val);


}
     public static  void midTraversal(Node node){
        if (node==null)
            return;
        midTraversal(node.left);
         list.add(node);
        midTraversal(node.right);

    }
}
