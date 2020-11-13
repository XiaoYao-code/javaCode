package code1113;

import java.util.Stack;

public class Solution {
    //操作给定的二叉树，将其变换为源二叉树的镜像。
    public void Mirror1(TreeNode root) {//递归解决
      if(root==null) {
          return;
      }
      TreeNode tmp=new TreeNode();
      root.left=tmp;
      root.left=root.right;
      root.right=tmp;
      Mirror1(root.left);
      Mirror1(root.right);
    }
    public void Mirror(TreeNode root) {//手动压栈
   if(root==null){
       return;
   }
   if (root.right==null&&root.left==null){
       return;
   }
   Stack<TreeNode> stack=new Stack<>();
   stack.push(root);
      TreeNode curNode;
      TreeNode tmpNode;
      while (!stack.empty()){
          curNode=stack.pop();//深度优先
          if (curNode==null){
              continue;
          }
          if (curNode.right==null&&curNode.left==null){
              continue;
          }
          tmpNode = curNode.left;
          curNode.left = curNode.right;
          curNode.right = tmpNode;
          stack.push(curNode.left);
          stack.push(curNode.right);
      }
    }

}
