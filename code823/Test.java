package code425;
//链接：https://ac.nowcoder.com/acm/contest/320/D
//来源：牛客网
//
//输入数据包括多组。
//每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
//接下来n个正整数,即需要求和的每个正整数。


import java.util.Scanner;

public class TestDemo {
    public static int sum(int a, int b)
    {
        int max= Math.max(a, b);
        for (int i=max; ;i++)
        {
            if ((i%a==0) && (i%b==0))
            {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
           int i=sum(a,b);
            System.out.println(i);
        }
    }
 /*   public Node deleteDuplication() {
        Node newHead = new Node(-1);
        Node tmp = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {

                newHead = cur;
                tmp = cur;
                tmp.next = cur;
                tmp = tmp.next;


                return newHead.next;
            }

        }
        return cur;
    }
    //判断环
    public boolean hasCycle() {
        if (this.head == null) {
            return false;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    //入口点
    public Node detectCycle() {
        if (this.head == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                fast=this.head;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return fast;
            }
        }
        return  null ;
    }*/
}
