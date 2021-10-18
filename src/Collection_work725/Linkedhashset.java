package Collection_work725;
import java.util.LinkedHashSet;

/*
	• 哈希表和链表实现的set接口，具有可预测的迭代次序
	• 由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
	• 由哈希表保证元素唯一，也就是说没有重复的元素

*/
public class Linkedhashset {
    public static void main(String[] args){
        LinkedHashSet<String> student=new LinkedHashSet<String>();
        student.add("tie");
        student.add("zui");
        student.add("tie");
        student.add("mei");

        for(String s:student){
            System.out.println(s);
        }
    }
}
