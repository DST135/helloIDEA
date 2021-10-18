package Collection_work725;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//使用迭代器进行集合的遍历
public class iteratorTest{
    public static void main(String[] args){
        Collection<String> list =new ArrayList<String>();
        list.add("tie");
        list.add("tie");
        list.add("zui");
        list.add("mei");

        Iterator<String> it=list.iterator();
        while(it.hasNext()){//判断集合是否为空
            System.out.println(it.next());//返回集合下一个元素
        }    
    }

}