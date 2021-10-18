
/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : DataStructures
 * @Package : com.atguigu.linkedlist
 * @ClassName : SinglePractice.java
 * @createTime : 2021/9/23 17:18
 * @Description :单链表练习
 */
public class cao {
    public static void main(String[] args) {
        heroNode hero1=new heroNode(1,"宋江","及时雨");
        heroNode hero2=new heroNode(2,"卢俊义","玉麒麟");
        heroNode hero3=new heroNode(3,"吴用","智多星");
        heroNode hero4=new heroNode(4,"林冲","豹子头");

        SingleList sl=new SingleList();
        sl.add(hero4);
        sl.add(hero1);
        sl.add(hero2);
        sl.add(hero3);


        sl.list();
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

    public void list(){
        if(headnode.next==null){
            System.out.println("链表为空");
            return;
        }
        heroNode temp=headnode.next;
        while(true){
            if(temp==null){
                break;
            }
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
