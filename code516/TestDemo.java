package code516;



public class TestDemo {
    public static void main(String[] args) {
       MyBinaryTree  myBinaryTree=new MyBinaryTree();
       Node s=myBinaryTree.buildTree();
       myBinaryTree.preOrderTraversal(s);
        System.out.println();
        Node s1=myBinaryTree.buildTree();

        myBinaryTree.middleOrderTraversal(s1);
        System.out.println();
        Node s2=myBinaryTree.buildTree();

        myBinaryTree.postOrderTraversal(s2);
    }
}
