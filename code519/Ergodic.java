package code519;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ergodic {
    //非递归前序遍历，迭代法
    public List<Integer> preorderTraversal(Node root) {
        List<Integer> list=new LinkedList<>();
        if (root==null){
            return list;
        }
        Node cur=root;
        Stack<Node> stack=new Stack<>();//通过栈去实现二叉树的前序遍历
        while (cur!=null||!stack.empty()) {//3.发现cur = stack.pop();
            //cur = cur.right;  也要走在循环中，所以为第一层的cur!=null；
            //4.发现如果该节点的右节点也为空，那么循环不能进入，为了保证循环进入，
            // 如果栈不为空则里边的每层的节点还没有遍历完，作为循环条件，栈为空则遍历完。
            while (cur != null) {//1.如果cur不为空，那么将cur放入栈中，cur的值保存在lsit中，cur走到cur的左节点，
                stack.push(cur);
                list.add(cur.val);
                cur = cur.left;
            }//2.如果cur的左节点为空，因为cur已经被赋值了，所以它也为空，cur首先拿到栈顶的元素，cur再等于栈顶节点的右节点，
            //继续作为第二层的开始（个人理解）
            cur = stack.pop();
            cur = cur.right;
        }
        return list;
    }
    //中序遍历非递归，迭代
    public List<Integer> inOrderTraversal(Node root) {
        List<Integer> list=new LinkedList<>();
        if (root==null){
            return list;
        }
        Node cur=root;
        Stack<Node> stack=new Stack<>();
        while (cur!=null||!stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);//放如list的位置变了而已
            cur = cur.right;
        }
        return list;
    }
}
