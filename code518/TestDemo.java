package code518;

import java.util.*;

class Node{
    int val;
    Node left;
    Node right;
    public Node(char val) {
        this.val = val;
    }
}
public class TestDemo {
    // 层序遍历
    void levelOrderTraversal(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
    }
/*
    public boolean levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();
        if(root == null) return ret;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);


        while (!queue.isEmpty()) {
            Node cur2 = queue.poll();
            if (cur2!=null){
                return false;
            }
            return true;














            //1、求当前队列的大小  size
              int size=queue.size();
              List <Integer>list=new ArrayList<>();
            //2、while(size > 0)  -->控制当前每一层的数据个数
            while (size>0){
                if (cur.left!=null){
                    queue.offer(cur.left);
                }
                if (cur.right!=null){
                    queue.offer(cur.right);
                }
                list.add(cur.val);
                size--;
            }
            ret.add(list);

        }
        return ret;
    }
*/
// 中序遍历
void inOrderTraversalNor(Node root){
    if (root==null){
        return;
    }
    Node cur=root;
    Stack <Node> stack=new Stack<>();
    while (cur!=null&&stack.empty()){
        while (cur!=null){
            stack.add(cur);
            cur=cur.left;
        }

        Node  s=stack.peek();
        System.out.println(s);
        stack.pop();
        cur=cur.right;
    }
}


}
