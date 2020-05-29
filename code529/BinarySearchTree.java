package code529;

public class BinarySearchTree {

    public static class Node{
        public int val;
        public Node left;
        public Node right;
        public Node(int val) {
            this.val = val;
        }
    }
    public Node root=null;
    public void insert(int val){//默认不重复的值
        Node node=new Node(val);
        Node cur=root;//cur赋值为头节点，准备开始遍历；
        Node parent=root;//parent保存cur的父节点
        if (cur==null){//如果cur==null；说明是第一次插入，直接让root=node;就是node作为根节点
            root=node;
            return;
        }
        while (cur!=null){//开始左右遍历找cur为空的位置。
            if (cur.val>val){//如果当前节点的val值大于val说明，插入的节点应该在当前节点的左树
                parent=cur;//parent保存cur当前的位置
                cur=cur.left;
            }else {
                parent=cur;//parent保存cur当前的位置
                cur=cur.right;//如果当前节点的val值大于val说明，插入的节点应该在当前节点的右树
            }
        }
        if (parent.val>val){
            parent.left=node;
        }else {
            parent.right=node;
        }
    }
    public boolean search(int val,Node node){//递归版本
        if (node==null) {
            return false;
        }
        if (node.val==val){
            return true;
        }
        return search(val, node.left)||search(val, node.right);
    }
    public boolean search1(int val,Node node){//遍历版本
        Node cur=node;
         while (cur!=null){
             if (cur.val==val){
                 return true;
             }else if (cur.val>val){
                 cur=cur.left;
             }else {
                 cur=cur.right;
             }
         }
         return false;
    }
    public boolean remove(int val,Node node){//遍历版本
        Node cur=node;
        while (cur!=null){
            if (cur.val==val){
                removechild( val,node);
            }else if (cur.val>val){
                cur=cur.left;
            }else {
                cur=cur.right;
            }
        }
        return false;
    }
    private void removechild(int val,Node node){

    }
    public void first(Node node){//前序遍历   根左右
        if (node==null) {
            return;
        }
        System.out.print(node.val+" ");
        first(node.left);
        first(node.right);
    }
    public void mind(Node node){//中序遍历  左右根
        if (node==null) {
            return;
        }
        mind(node.left);
        System.out.print(node.val+" ");
        mind(node.right);
    }
}
