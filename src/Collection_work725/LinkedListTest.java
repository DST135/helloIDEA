package Collection_work725;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList<String> student=new LinkedList<String>();
        student.add("tie");
        student.add("zui");
        student.add("tie");
        student.add("mei");
        System.out.println(student);
        
        student.addFirst("baba");//public void addFirst(E e) 在链表首插入元素
        student.addLast("uuu");//public void addLast(E e) 在链表尾插入元素
        System.out.println(student);
        String s1=student.getFirst();//public E getFirst() 返回表首元素
        String s2=student.getLast();//public E getLast() 返回表尾元素
        String s3=student.removeFirst();//public E removeFirst() 删除并返回表首元素
        String s4=student.removeLast();//public E removeLast() 删除并返回表尾元素
        System.out.println(student);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
        
}
