package Collection_work725;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest1 {
    public static void main(String[] args){
        List<String> student=new ArrayList<String>();
        student.add("tie");
        student.add("zui");
        student.add("tie");
        student.add("mei");

        //正向遍历
        ListIterator<String> is=student.listIterator();
        while(is.hasNext()){
            String s=is.next();
            System.out.println(s);
        }
        //逆向遍历
        while(is.hasPrevious()){
            String s=is.previous();
            System.out.println(s);
        }
        while(is.hasNext()){
            String s=is.next();
            if(s.equals("mei")){
                is.add("world");//不是student.add()
            }
        }

        //增强for循环
        for(String s:student){
            System.out.println(s);
        }
    }
    

}
