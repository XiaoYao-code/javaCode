package code529;

public class TestDemo {
    public static void main(String[] args) {
        BinarySearchTree bSTree=new BinarySearchTree();
        int[]arr={10,7,5,20,30,15,1};
        for (int a:arr) {
            bSTree.insert(a);
        }
         bSTree.first(bSTree.root);
        System.out.println();
         bSTree.mind(bSTree.root);
        System.out.println();
        System.out.println(bSTree.search(1, bSTree.root));
        System.out.println(bSTree.search1(10,bSTree.root));
    }

}
