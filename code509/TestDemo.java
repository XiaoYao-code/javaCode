package code509;


public class TestDemo {
   /* public Node back() {
        if (this.head == null) {
            return null;
        }
        Node pre = null;//需要考虑一个节点的情况，当只有一个节点时，循环进去后该节点为头，跳出一层循环后pre和cur重合
        Node cur = this.head;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            //这种方法实际上时迭代，用pre。cur.curNext来进行操作，pre保存cur的前一个节点，
            // curNext保存cur后一个节点，然后将cur指向它的前驱pre，判断curNext是否为空如果curNext为空则说明
            // curNext的前驱cur是新的链表头节点，同时cur是整个循环的大前提，如果cur为空，那么说明逆置完毕。
            // 迭代关系先后顺序应该是：
            //1.cur指向pre  2.pre=cur   3.cur=curNext  4.curNext=cur.next(需要curNext对cur的下一个节点进行保存
            // 因为一旦逆置，因为是单向的，所以会丢失原本cur的下一个节点地址)
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return newHead;
    }

    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。
    public Node middleNode() {
        if (this.head == null) {
            return null;
        }
        //快慢指针：定义两根指针，移动的速度一快一慢，以此来制造出自己想要的差值。这个差值可以让我们找到链表上相应的节点。
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            //fast!=null适用于偶数长度的链表，fast.next!=null使用于奇数长度的链表
            // 如果fast.next为空，那么fast.next.next则会出现指针异常。所以限定条件时fast和fast.next都不能为空
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //输入一个链表，输出该链表中倒数第k个结点
    public Node searchK(int k) {
        if (this.head == null) {
            return null;
        }
        if (k>this.size()){
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k > 1) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.data < x) {
                //第一次插入
                if (bs == null) {
                    bs = cur;
                    be=  cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                //第一次插入
                if (as == null) {
                    as = cur;
                    ae=cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //1.判断bs是否为空  如果bs == null 返回as
        if (bs == null) {
            return as;
        } else {
            //2、如果bs不为空  需要进行拼接
            be.next = as;
            if (as != null) {
                ae.next = null;
            }
            return bs;
        }
        //3、如果ae不为空    ae的next需要置为空


    }
    public Node deleteDuplication() {
        Node newHead=new Node(-1);
        Node tmp=null;
        Node cur=this.head;
        while (cur!=null){
            if (cur.next!=null&&cur.data==cur.next.data){
                while (cur.next!=null&&cur.data==cur.next.data){
                    cur=cur.next;
                }
                cur=cur.next;
            }else {

                newHead=cur;
                tmp=cur;
                tmp.next=cur;
                tmp=tmp.next;


                return newHead.next;
            }

        }*/
}