package code517;
class Node{
    char val;
    Node left;
    Node right;
    public Node(char val) {
        this.val = val;
    }
}
public class TestDemo {
    // 获取二叉树的高度
    int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        int leftmax=getHeight(root.left);
        int rightmax=getHeight(root.right);
        return 1+leftmax>rightmax?leftmax:rightmax;
}
    Node find(Node root, int val){
        if(root == null) {
            return null;
        }
        //1、判断根节点是否是查找的数字val
        if(root.val == val) {
            return root;
        }
        //2、左边
        //  递归--》左边全部递归完成后-》返回值是否是空
         Node leftreturn=find(root.left,val);
        if (leftreturn!=null){
            return leftreturn;
        }
        //3、右边
        Node rightreturn=find(root.right,val);
        if (rightreturn!=null){
            return rightreturn;
        }
        return null;
    }
    public boolean isSameTree(Node p, Node q) {
     if (p==null&&q==null)return true;
     if (p==null||q==null)return false;
     if (p.val==q.val) {
         return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
     }
     return false;
    }
    public boolean isSubtree(Node s, Node t) {
        if(s == null && t == null) {
            return true;
        }
        if (s==null||t==null){
            return false;
        }
        if (isSameTree(s,t)){
            return true;
        }
        return isSameTree(s.left,t)||isSameTree(s.right,t);




    }
    class Solution {

        }
    public boolean isBalanced(Node root) {
        if (root==null) {
            return true;
        }
        if (Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1){
            boolean flag1=isBalanced(root.right);
            boolean flag2=isBalanced(root.left);
            return   flag1&&flag2;
        }
        return false;
    }

    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return leftHeight >  rightHeight? leftHeight+1 :
                rightHeight+1;
    }
    public boolean isSymmetric(Node root) {
        if (root==null){
            return true;
        }
        return isSymmetricchild(root.left,root.right);


    }
    public boolean isSymmetricchild(Node root1,Node root2) {
        if ((root2!=null&&root1==null)||(root2==null&&root1!=null)){
            return false;
        }
        if (root1 == null){
            return true;
        }

        return root1.val==root2.val&&
                isSymmetricchild(root1.right,root2.left)&&isSymmetricchild(root1.left,root2.right);


    }
    }








