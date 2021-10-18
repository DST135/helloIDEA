package dataStructice;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : dataStructice
 * @ClassName : SingleLinkedList.java
 * @createTime : 2021/9/24 15:20
 * @Description :单链表练习，
 * （1）反转
 * （2）逆序打印
 * 方式1：先将单链表进行反转操作，然后再遍历即可，这样的做的问题是会破坏原来的单游表的结构，不建议
 * 方式2：可以利用找这个数据结构，将各个节点压入到栈中，然后利用栈的先进后出的特点，就实现了逆序打印的效果
 * (3)合并两个有序链表，合之后依然有序
 */

public class SingleLinkedList {
    public static void main(String[] args) {
        heroNode hero1=new heroNode(1,"宋江","及时雨");
        heroNode hero2=new heroNode(2,"卢俊义","玉麒麟");
        heroNode hero3=new heroNode(3,"吴用","智多星");
        heroNode hero4=new heroNode(4,"林冲","豹子头");
        heroNode hero5=new heroNode(5,"林冲gge","豹子头kk");

        SingleList sl=new SingleList();
        SingleList sl1=new SingleList();
        sl.addRange(hero1);
        sl.addRange(hero2);
        sl.addRange(hero4);
        sl.addRange(hero3);
        sl.addRange(hero5);
//        sl.list();
//        sl1.list();
        SingleList newsl=new SingleList();
        newsl.getHeadnode().next=combine2(sl.getHeadnode().next, sl1.getHeadnode().next);
        newsl.list();
//        sl.list();
//        reverse(sl.getHeadnode());
//        sl.list();
//        System.out.println("----------");
//        reveprint(sl.getHeadnode());
//

//        sl.delete(1);
//        sl.list();
//        System.out.println(getlength(sl.getHeadnode()));
//        System.out.println(findIndex(sl.getHeadnode(), 2));
    }

    //合并两个单链表递归做法//head1,head2实际为首结点而不是头节点,返回值也为首结点
    public static heroNode combine(heroNode head1,heroNode head2){
        if(head1==null || head2==null) return head1!=null?head1:head2;
//        if (head1 == null && head2 == null) {
//            return null;
//        }
//        if (head1 == null) {
//            return head2;
//        }
//        if (head2 == null) {
//            return head1;
//        }
        heroNode newhead=null;
        if(head1.no> head2.no){
            newhead=head2;
            newhead.next=combine(head1,head2.next);
        }else {
            newhead=head1;
            newhead.next=combine(head1.next,head2);
        }
        return newhead;
    }

    //合并两个单链表非递归做法//head1,head2实际为首结点而不是头节点,返回值也为首结点
    public static heroNode combine2(heroNode head1,heroNode head2){ //head1,head2实际为首结点而不是头节点
        if(head1==null || head2==null) return head1!=null?head1:head2;
        heroNode head=null;
        heroNode cur1=head1;
        heroNode cur2=head2;
        if(head1.no>=head2.no){
            head=head2;
            cur2=cur2.next;
        }else {
            head=head1;
            cur1=cur1.next;
        }
        heroNode temp=head;

        while(cur1!=null && cur2!=null){
            if(cur1.no>= cur2.no){
                temp.next=cur2;
                cur2=cur2.next;
            }else{
                temp.next=cur1;
                cur1=cur1.next;
            }
            temp=temp.next;
        }
//        if(cur1==null) temp.next=cur2;
//        if(cur2==null) temp.next=cur1;
        temp.next=cur1==null?cur2:cur1;
        return head;
    }

    //得到链表有效结点个数
    public static int getlength(heroNode head){
        int count=0;
        if(head.next==null) return 0;
        heroNode temp=head.next;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    //查找单链表中倒数第index个结点
    public static heroNode findIndex(heroNode head,int index){
        if(head.next==null) return null;
        int size=getlength(head);
        heroNode temp=head.next;
        //index合法性
        if(index<=0 || index>size) return null;
        for(int i=0;i<size-index;i++){
            temp=temp.next;
        }
        return temp;
    }

    //反转链表
    public static void reverse(heroNode headnode){
        if(headnode.next==null || headnode.next.next==null) return;
        heroNode head=new heroNode(0,"","");
        heroNode temp=headnode.next;
        heroNode next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=head.next;//让当前结点指向新链表最前端
            head.next=temp;
            temp=next;

        }
        headnode.next=head.next;
    }

    //逆序打印
    public  static void reveprint(heroNode head){
        if(head.next==null) return;
        heroNode temp=head.next;
        Stack<heroNode> stack = new Stack<heroNode>();
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }

    }

}

class SingleList{
    private heroNode headnode=new heroNode(0,"","");

    public void add(heroNode node){
        heroNode temp=headnode;
        while(true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=node;
    }

    //返回头节点
    public heroNode getHeadnode() {
        return headnode;
    }

    //加入时按照排名顺序插入
    public void addRange(heroNode node){
        heroNode temp=headnode;
        while(true){
            if(temp.next==null) break;
            if(temp.next.no>node.no) break;
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }

    //修改结点,no不能改变
    public void update(heroNode node){
        int flag=0;
        heroNode temp=headnode;
        if(temp.next==null){
            System.out.println("链表为空");
            return;
        }
        while(true){
            if(temp.next==null){
                flag=1;//不存在no
                break;
            }
            if(node.no==temp.next.no) break;
            temp=temp.next;
        }
        if(flag==1){
            System.out.println("不存在结点，无法修改");
            return;
        }
        temp.next.name= node.name;
        temp.next.nickName= node.nickName;
    }

    //删除结点,不存在不能删
    public void delete(int noo){
        int flag=0;
        heroNode temp=headnode;
        if(temp.next==null){
            System.out.println("链表为空");
            return;
        }
        while (true){
            if(temp.next==null){
                flag=1;
                break;
            }
            if(temp.next.no==noo){
                break;
            }
            temp=temp.next;
        }
        if(flag==1){
            System.out.println("不存在结点，无法删除");
            return;
        }
        temp.next=temp.next.next;
    }


    //展示链表所有结点
    public void list(){
        if(headnode.next==null){
            System.out.println("链表为空");
            return;
        }
        heroNode temp=headnode.next;
        while(temp!=null){
            System.out.println(temp);
            temp=temp.next;

        }
    }
}

class heroNode{
    public int no;
    public String name;
    public String nickName;
    public heroNode next;

    public heroNode(int no,String name,String nickName){
        this.no=no;
        this.name=name;
        this.nickName=nickName;
    }

    @Override
    public String toString() {
        return "heroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName +"}";
    }
}
