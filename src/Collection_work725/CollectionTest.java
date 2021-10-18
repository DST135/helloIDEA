package Collection_work725;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest{
    public static void main(String[] args){
        //创建collection集合的对象
        Collection<String> c =new ArrayList<String>();
        
        //添加元素 Boolean add(E e) 
        boolean b=c.add("tietie");
        c.add("zuimei");
        System.out.println(b);
        System.out.println(c);

        //从集合种移除指定元素 boolean remove(Object o)
        boolean b1=c.remove("tietie");
        System.out.println(b1);
        System.out.println(c);

        //判断集合中是否存在指定元素 boolean contains(Object o)
        boolean b2=c.contains("laji");
        System.out.println(b2);
        System.out.println(c);

        //判断集合是否为空 boolean isEmpty()
        boolean b3=c.isEmpty();
        System.out.println(b3);

        //集合长度 int size()
        System.out.println(c.size());
        
        //清楚集合元素 void clear()
        c.clear();
        System.out.println(c);
    }
}