package Collection_work725.Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//泛型好处
//把运行时期的问题提前到了编译期
//避免了强制类型转换
public class GenericTest {
    public static void main(String[] args){
        Collection<String> student=new ArrayList<>();
        student.add("tie");
        student.add("zui");
        student.add("tie");
        student.add("mei");
        //student.add(100);//ClassCastException 类转换异常

        Iterator<String> it=student.iterator();
        while(it.hasNext()){
            //String s=(String)it.next();
            String s=it.next();
            System.out.println(s);
        }
    }
}
