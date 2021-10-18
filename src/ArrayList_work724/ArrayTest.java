package ArrayList_work724;
import java.util.ArrayList;
public class ArrayTest {
    public static void main(String[] args){
        ArrayList<Integer> in=new ArrayList<Integer>();
        Integer x=10;
        in.add(100);//插入元素到集合尾
        in.add(x);
        in.add(0,177);//public void add( int index,E e) 在指定位置插入元素
        Integer i=in.remove(0);//public E remove(int index) 删除指定索引的元素，返回被删除元素
        Boolean b=in.remove(x);//public boolean remove(Object o) 删除指定的元素，返回删除是否成功
        Integer i1=in.set(0,99);//public E set(int index,E e) 修改索引处元素，返回被修改的元素
        Integer i2=in.get(0);//public Eget(int index) 返回索引处元素
        Integer i3=in.size();//public int size() 返回集合元素个数
        System.out.println(in);
        System.out.println(i);
        System.out.println(b);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        //集合遍历
        //(1)
        for(Integer y:in){
            System.out.println(y);
        }
        //(2)
        for(int j=0;j<in.size();j++){
            System.out.println(in.get(j));
        }

    }
}
