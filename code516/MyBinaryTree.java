package code516;

import java.util.ArrayList;
import java.util.List;

class Node{
    char val;
    Node left;
    Node right;
    public Node(char val) {
        this.val = val;
    }
}
public class MyBinaryTree {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
    }
    public Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }
    void preOrderTraversal(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    void postOrderTraversal(Node root){
        if (root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);
    }
    void middleOrderTraversal(Node root){
        if (root==null){
            return;
        }
        middleOrderTraversal(root.left);
        System.out.print(root.val);
        middleOrderTraversal(root.right);
    }
}
