package code520;

import org.omg.CORBA.NO_IMPLEMENT;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}
public class OJ {
    //后序迭代遍历二叉树
    public List<Integer> postorderTraversal(Node root) {
        List <Integer> list=new LinkedList<>();
        if (root==null){
            return list;
        }
        Stack <Node> stack=new Stack<>(); //用栈来辅助实现
        Node cur=root;
        Node prev=null;
        while (cur!=null||!stack.empty()){
            while (cur!=null){//1.与前中遍历类似cur一直走到某个树的最左下方的一个节点。
                stack.push(cur);  //2.把左节点放入栈中
                cur=cur.left;
            }
            cur=stack.peek();//3.子循环结束，那么cur一定为null；拿到栈顶元素（也就是一个树的最下左的一个节点）。
            if (cur.right==null||cur.right==prev){//4.判断该节点有没有右节点如果没有拿到val值再删除栈顶
                list.add(cur.val);
                stack.pop();
                prev=cur;//对于有一个有右节点的节点，因为每次peek会拿到这个节点，这个节点又有右子树，那么它一直会循环else，始终打印这个右子节点。
                //于是定义一个cur的前驱，作用是：如果没有右节点或者该节点的右节点是prev说明这个节点已经被遍历过不再将这个节点再等于它的右节点
                cur=null;//6.如果该节点是最这个树的最左下节点，并且没有右子树，那么它会一直删除，再放入，于是在它删除该节点后，把他置为空，下一次循环的时候拿到它的父节点
            }else{
                cur=cur.right;
                //5.如果有右节点，那么cur走到该节点的右节点
            }
        }
        return list;
    }
    int i=0;
    public Node buildTree(String str){//根据一个前序遍历的得到的字符串来构建二叉树例如ABC##DE#G##F###  #代表的是null；
        Node root=null;
        if (str.charAt(i)!='#'){ ///子问题  每一个不为#的节点都是一个根节点
            root=new Node(str.charAt(i));  //创建一颗树的根节点
            i++;
            root.left=buildTree(str); //创建树的左节点
            root.right=buildTree(str);//创建树的右节点
        }else {
            i++;
        }
        return root;
    }
    public Node lowestCommonAncestor(Node root, Node p, Node q) {//给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
        //百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
        //满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。


        if (root == null) {//1.如果root为空  那么没有公共祖先节点
            return null;
        }
        if (root == p || root == q) {//1.如果root==p，q其中一个那么公共节点是先遇到的节点
            return root;
        }
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {//左右都找到了，说明最近公共祖先就是root
            return root;
        } else if (left == null) {
            return right;
        } else {
            return left;
        }

    }
}
