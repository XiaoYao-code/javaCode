package code528;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestDemo1 {
    public  int search(String J,String S){
        int num=0;
        HashSet <Character>set=new HashSet<>();
        for (int i = 0; i <J.length() ; i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i <S.length() ; i++) {
            if (set.contains(S.charAt(i))){
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();//7_This_is_a_test
        String actual = scanner.nextLine();//_hs_s_a_es
        Character []arr={};
        //1、把实际的字符转换为大写存放到集合当中
        HashSet<Character> setActual = new HashSet<>();
        for (char s : actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }
        for (int i = 0; i <expected.length() ; i++) {
           if(! setActual.contains(expected.charAt(i))){
               arr[i]=expected.charAt(i);
           }
        }
        System.out.println(arr.toString());

    }
    /**
     * Created with IntelliJ IDEA.
     * Description:
     * User: GAOBO
     * Date: 2020-05-28
     * Time: 19:55
     */
    public class BSTree {
        public  class Node {
            public int val;
            public Node left;
            public Node right;
            public Node(int val) {
                this.val = val;
            }
        }
        public Node root = null;
        public boolean insert(int val) {
            Node node = new Node(val);
            if(root == null) {
                root = node;
                return true;
            }
            Node cur = root;
            Node parent = null;
            while (cur != null) {
                if (cur.val == val) {
                    return false;
                }else if(cur.val < val) {
                    parent=cur;
                  cur=cur.right;
                }else {
                    parent=cur;
                    cur=cur.left;
                }
            }
            //cur为空  位置找到  进行插入
            //两种情况-》
            if(parent.val < val){
                parent.right=node;
                return true;
            }else {
                parent.left=node;
                return true;
            }

        }
    }


}
