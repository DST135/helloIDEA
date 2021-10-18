package Collection_work725;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args){
        List<String> student=new ArrayList<String>();
        student.add("tie");
        student.add("zui");
        student.add("tie");
        student.add("mei");

        /*
        student.remove(2);
        student.set(0, "la");
        String s=student.get(2);
        System.out.println(student);
        */
        
        //ConcurrentModificationException 并发修改异常
        Iterator<String> it=student.iterator();
        while(it.hasNext()){
            String s=it.next();
            if(s.equals("mei")){
                student.add("world");
            }
        }

        //ListIterator的 void add(E e)方法，将modCount赋值给expectedModCount,不出现并发异常
        ListIterator<String> is=student.listIterator();
        while(is.hasNext()){
            String s=is.next();
            if(s.equals("mei")){
                is.add("world");//不是student.add()
            }
        }

        //使用for循环
        for(int i=0;i<student.size();i++){
            String s=student.get(i);
            if(s.equals("mei")){
                student.add("world");
            }
        }
        
        System.out.println(student);
    }
}
