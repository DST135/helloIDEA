package Collection_work725;

import java.util.HashSet;
import java.util.Set;
/*
	• 不包含重复元素的集合
	• 没有带索引的方法，所以不能使用通for循环遍历
*/
//HashSet对集合的迭代次序不作任何保证
public class setTest {
    public static void main(String[] args){
        Set<String> student=new HashSet<>();
        student.add("tie");
        student.add("zui");
        student.add("tie");
        student.add("mei");

        System.out.println(student);
        for(String s:student){
            System.out.println(s);
        }

    }
}
